import java.util.Iterator;
import java.util.List;

public class Mes {
    private String nome;
    private int numMes;
    private float temperatura;

    public Mes(String nome, int numMes, float temperatura) {
        setNome(nome);
        setNumMes(numMes);
        setTemperatura(temperatura);
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumMes() {
        return numMes;
    }

    public void setNumMes(int numMes) {
        this.numMes = numMes;
    }

    public static float mediaTempSemes(List<Mes> tempGrausMeses) {
        Iterator<Mes> iterator = tempGrausMeses.iterator();
        float media = 0.0f;
        while (iterator.hasNext()) {
            float next = iterator.next().getTemperatura();
            media += next;
        }
        return media / tempGrausMeses.size();
    }

    @Override
    public String toString() {
        return "{" + "nome='" + nome + '\'' + ", numMes=" + numMes + ", temperatura=" + temperatura  + '}' + "\n";
    }
}


