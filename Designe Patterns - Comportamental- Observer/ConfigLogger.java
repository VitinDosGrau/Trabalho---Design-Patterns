class ConfigLogger implements ConfigObserver {
    @Override
    public void update(String key, String value) {
        System.out.println("Configuração alterada - " + key + ": " + value);
    }
}
