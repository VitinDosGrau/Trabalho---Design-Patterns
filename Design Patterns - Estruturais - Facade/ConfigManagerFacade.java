// Facade para gerenciar todas as configurações
class ConfigManagerFacade {
    private DatabaseConfig databaseConfig;
    private UIConfig uiConfig;

    public ConfigManagerFacade() {
        databaseConfig = new DatabaseConfig();
        uiConfig = new UIConfig();
    }

    public String getDatabaseSetting(String key) {
        return databaseConfig.getSetting(key);
    }

    public void setDatabaseSetting(String key, String value) {
        databaseConfig.setSetting(key, value);
    }

    public void displayDatabaseSettings() {
        databaseConfig.displaySettings();
    }

    public String getUISetting(String key) {
        return uiConfig.getSetting(key);
    }

    public void setUISetting(String key, String value) {
        uiConfig.setSetting(key, value);
    }

    public void displayUISettings() {
        uiConfig.displaySettings();
    }

    public void displayAllSettings() {
        displayDatabaseSettings();
        displayUISettings();
    }
}
