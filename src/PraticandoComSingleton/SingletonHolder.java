public class SingletonHolder {
    private SingletonHolder() {}

    private static class Holder {
        private static final SingletonHolder INSTANCE = new SingletonHolder();
    }

    public static SingletonHolder getInstance() {
        return Holder.INSTANCE;
    }

    public void mostrarMensagem() {
        System.out.println("Singleton com Holder (Lazy initialization thread-safe - Bill Pugh)");
    }
}