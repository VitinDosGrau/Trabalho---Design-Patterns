import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Map<String, String> settings;

    // Construtor privado para evitar instanciamento externo
    private ConfigurationManager() {
        settings = new HashMap<>();
        // Carregar configurações padrão
        settings.put("appName", "MeuAplicativo");
        settings.put("version", "1.0.0");
        settings.put("theme", "light");
    }

    // Método público estático para obter a instância única
    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Métodos para gerenciar configurações
    public String getSetting(String key) {
        return settings.get(key);
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
    }

    public void removeSetting(String key) {
        settings.remove(key);
    }

    public void displaySettings() {
        System.out.println("Configurações da Aplicação:");
        for (Map.Entry<String, String> entry : settings.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}