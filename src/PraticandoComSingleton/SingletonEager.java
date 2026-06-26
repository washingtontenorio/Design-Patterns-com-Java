public class SingletonEager {
    private static final SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getInstance() {
        return INSTANCE;
    }

    public void mostrarMensagem() {
        System.out.println("Singleton Eager (Instanciado na carga da classe)");
    }
}