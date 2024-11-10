import java.util.ArrayList;
import java.util.List;

class ConfigurationManager {
    private final List<ConfigObserver> observers;
    private final List<ConfigSetting> settings;

    public ConfigurationManager() {
        observers = new ArrayList<>();
        settings = new ArrayList<>();
    }

    public void addObserver(ConfigObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ConfigObserver observer) {
        observers.remove(observer);
    }

    public void setSetting(String key, String value) {
        for (ConfigSetting setting : settings) {
            if (setting.getKey().equals(key)) {
                setting.setValue(value);
                notifyObservers(key, value);
                return;
            }
        }
        settings.add(new ConfigSetting(key, value));
        notifyObservers(key, value);
    }

    public String getSetting(String key) {
        for (ConfigSetting setting : settings) {
            if (setting.getKey().equals(key)) {
                return setting.getValue();
            }
        }
        return null;
    }

    private void notifyObservers(String key, String value) {
        for (ConfigObserver observer : observers) {
            observer.update(key, value);
        }
    }
}
