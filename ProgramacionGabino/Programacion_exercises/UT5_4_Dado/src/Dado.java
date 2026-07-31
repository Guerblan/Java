import java.util.Random;

public class Dado {
    private static int identificador = 0;
    private int identificadorDado;
    private static Random random = new Random();
    private int nCaras;
    private int modificador;

    public Dado() {
        Dado.identificador++;
        this.identificadorDado = identificador;
        this.nCaras = 6;
        this.modificador = 0;
    }

    public Dado(int nCaras, int modificador) {
        Dado.identificador++;
        this.identificadorDado = identificador;
        this.nCaras = nCaras;
        this.modificador = modificador;
    }

    // Getters
    public int getIdentificadorDado() {
        return identificadorDado;
    }

    public int getNCaras() {
        return nCaras;
    }

    public int getModificador() {
        return modificador;
    }

    // Setters
    public void setnCaras(int nCaras) {
        if (nCaras == 4 || nCaras == 6 || nCaras == 8 || nCaras == 10 || nCaras == 12 || nCaras == 20
                || nCaras == 100) {
            this.nCaras = nCaras;
        }
    }

    public void setModificador(int modificador) {
        this.modificador = modificador;
    }

    // Methods
    public int tirarDado() {
        return random.nextInt(this.nCaras )+ 1;
    }

    public int tirarDadoMod() {
        return tirarDado() + this.modificador;
    }

    public int tirarDados(int nCaras) {
        int total = 0;
        for (int i = 0; i < nCaras; i++) {
            total += tirarDado();
        }
        return total;
    }

    public int tirarDadosMod(int nCaras) {
        int total = 0;
        for (int i = 0; i < nCaras; i++) {
            total += tirarDadoMod();
        }
        return total;
    }

    public int tirarConVentaja() {
        int dado1 = tirarDado();
        int dado2 = tirarDado();
        if (dado1 >= dado2) {
            return dado1;
        } else {
            return dado2;
        }
    }

    public int tirarConVentajaMod() {
        int dado1 = tirarDado();
        int dado2 = tirarDado();
        if (dado1 >= dado2) {
            return dado1 + this.modificador;
        } else {
            return dado2 + this.modificador;
        }
    }

    public int tirarConDesventaja() {
        int dado1 = tirarDado();
        int dado2 = tirarDado();
        if (dado1 <= dado2) {
            return dado1;
        } else {
            return dado2;
        }
    }

    public int tirarConDesventajaMod() {
        int dado1 = tirarDado();
        int dado2 = tirarDado();
        if (dado1 <= dado2) {
            return dado1 + this.modificador;
        } else {
            return dado2 + this.modificador;
        }
    }

    public int hacerTrampa(){
        int trampa = random.nextInt(10);
        if (trampa < 9) {
            return this.nCaras;
        } else {
            return tirarDado();
        }
    }

    public int hacerTrampaMod(){
        int trampa = random.nextInt(10);
        if (trampa < 9) {
            return this.nCaras + this.modificador;
        } else {
            return tirarDadoMod();
        }
    }
}
