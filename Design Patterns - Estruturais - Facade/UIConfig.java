import java.util.Map;
import java.util.HashMap;

// Configuração de interface do usuário
class UIConfig {
    private Map<String, String> settings;

    public UIConfig() {
        settings = new HashMap<>();
        settings.put("theme", "light");
        settings.put("language", "en");
    }

    public String getSetting(String key) {
        return settings.get(key);
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
    }

    public void displaySettings() {
        System.out.println("Configurações da Interface do Usuário:");
        for (Map.Entry<String, String> entry : settings.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
