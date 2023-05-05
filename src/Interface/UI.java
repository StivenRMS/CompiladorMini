package Interface;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import Interpreter.gramaticaBaseListener;
import Interpreter.gramaticaLexer;
import Interpreter.gramaticaParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import Symbol.SymbolTable;
import Symbol.MyListerner1;

public class UI {
    private SymbolTable symbolTable;
    public JFrame frame;
    private JTextField textField;
    private JButton compileButton;
    private JTextArea consoleArea;
    private JTextArea symbolTableArea;

    public UI() {
        // Crear el campo de texto para ingresar el código
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(600, 30));
        textField.setFont(new Font("Arial", Font.PLAIN, 16));

        // Crear el botón de compilación
        compileButton = new JButton("Compilar");
        compileButton.setPreferredSize(new Dimension(120, 30));
        compileButton.setFont(new Font("Arial", Font.PLAIN, 16));

        // Crear el panel para agregar el campo de texto y el botón de compilación
        JPanel topPanel = new JPanel(new BorderLayout(10, 0));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        topPanel.add(textField, BorderLayout.CENTER);
        topPanel.add(compileButton, BorderLayout.EAST);

        // Crear el área de texto para la salida de la consola
        consoleArea = new JTextArea();
        consoleArea.setEditable(false);
        consoleArea.setFont(new Font("Arial", Font.PLAIN, 16));
        JScrollPane consoleScrollPane = new JScrollPane(consoleArea);
        consoleScrollPane.setPreferredSize(new Dimension(600, 200));

        // Crear el área de texto para la tabla de símbolos
        symbolTableArea = new JTextArea();
        symbolTableArea.setEditable(false);
        symbolTableArea.setFont(new Font("Arial", Font.PLAIN, 16));
        JScrollPane symbolTableScrollPane = new JScrollPane(symbolTableArea);
        symbolTableScrollPane.setPreferredSize(new Dimension(600, 250));

        // Agregar los paneles al frame
        frame = new JFrame("Compilador");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(topPanel, BorderLayout.NORTH);
        frame.getContentPane().add(consoleScrollPane, BorderLayout.CENTER);
        frame.getContentPane().add(symbolTableScrollPane, BorderLayout.SOUTH);

        symbolTable = new SymbolTable(); // Crea una nueva instancia de la tabla de símbolos

        // Agregar la acción de compilación al botón
        compileButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el código del campo de texto
                String code = textField.getText();

                // Crear un analizador léxico y un analizador sintáctico
                CharStream input = CharStreams.fromString(code);
                gramaticaLexer lexer = new gramaticaLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                gramaticaParser parser = new gramaticaParser(tokens);

                // Redirigir la salida de la consola al área de texto correspondiente
                OutputStream outputStream = new OutputStream() {
                    @Override
                    public void write(int b) throws IOException {


                        consoleArea.append(String.valueOf((char) b));
                        consoleArea.setCaretPosition(consoleArea.getDocument().getLength());
                    }
                };
                System.setOut(new PrintStream(outputStream));
                System.setErr(new PrintStream(outputStream));


                MyListerner1 listener = new MyListerner1();


                // Ejecutar el analizador sintáctico
                ParseTreeWalker walker = new ParseTreeWalker();
                walker.walk(listener, parser.program());

                // Crear un nuevo listener y pasarle la tabla de símbolos
                SymbolTable symbolTable = listener.getSymbolTable();
                Map<String, String> data = symbolTable.getTabla();
                String dataS=" ";
                int contador=0;
                for (Map.Entry<String, String> entry : data.entrySet()) {
                    contador++;
                    String key = entry.getKey();
                    String value= entry.getValue();
                    dataS +="No. "+contador+ ". key: " + key + " value:" + value +  "\n";
                }
                //data.forEach((key,value)-> dataS="key+> "+key+" value+>"+ value.toString() +"\n");
                symbolTableArea.setText(dataS);
                // Obtener el texto del área de texto de errores
                String errorText = consoleArea.getText();
                symbolTableArea.setVisible(false);
                consoleArea.setVisible(false);

                 // Verificar si el texto del área de texto de errores no está vacío o nulo
                if (errorText != null && !errorText.isEmpty()) {
                    // Establecer la visibilidad del área de texto de tabla de símbolos a true
                    symbolTableArea.setVisible(false);
                    consoleArea.setVisible(true);
                    compileButton.setEnabled(false);
                } else {
                    // Establecer la visibilidad del área de texto de tabla de símbolos a false
                    symbolTableArea.setVisible(true);
                    consoleArea.setVisible(false);
                    compileButton.setEnabled(false);

                }

            }

            //------------------------------------------------------------------

        });


    }


    public class MyListener extends gramaticaBaseListener {
        //eliminar esto---------------
        private SymbolTable symbolTable;

        public MyListener(){}
        public MyListener(SymbolTable symbolTable){
            this.symbolTable=symbolTable;
        }

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
                                String msg, RecognitionException e) {
            System.err.println("Error de sintaxis en línea " + line + ":" + charPositionInLine + " - " + msg);
        }
    }

    class TextAreaPrintStream extends PrintStream {
        private JTextArea textArea;

        public TextAreaPrintStream(JTextArea textArea) {
            super(new OutputStream() {
                @Override
                public void write(int b) throws IOException {
                    // No se hace nada, ya que no se utiliza OutputStream directamente
                }
            });
            this.textArea = textArea;
        }

        @Override
        public void write(byte[] buf, int off, int len) {
            String text = new String(buf, off, len);
            SwingUtilities.invokeLater(() -> textArea.append(text));
        }
    }


}







