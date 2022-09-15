package aluno;

public class Aluno {
    private String nome;
    private String casa;
    private String anoLetivo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(String anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() == obj.getClass()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Casa: %s, Ano letivo: %s", nome, casa, anoLetivo);
    }
}
