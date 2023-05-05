package Symbol;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private Map<String, String> symbols;

    public SymbolTable() {
        symbols = new HashMap<String,String>();
    }
    public Map<String,String> getTabla(){
        return symbols;
    }


    public void addSymbol(String name, String value) {
        symbols.put(name, value);
    }

    public Object getSymbol(String name) {
        return symbols.get(name);
    }

    public boolean containsSymbol(String name) {
        return symbols.containsKey(name);
    }

    public void removeSymbol(String name) {
        symbols.remove(name);
    }

    public void clear() {
        symbols.clear();
    }


}
