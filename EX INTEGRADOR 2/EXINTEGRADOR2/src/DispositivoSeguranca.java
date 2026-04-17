public abstract class DispositivoSeguranca {
    protected String localizacao;
    protected boolean ativo;

    public DispositivoSeguranca() {
    }

    public DispositivoSeguranca(String localizacao, boolean ativo) {
        this.localizacao = localizacao;
        this.ativo = ativo;
    }

    public void status(){
        System.out.println("    ==  LOCALIZAÇÃO ==  " + localizacao );
        System.out.println("    ==  STATUS DO DISPOTIVO ==  " + ativo );

    }

    public abstract void dispararAlerta();

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "DispositivoSeguranca{" +
                "localizacao='" + localizacao + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}
