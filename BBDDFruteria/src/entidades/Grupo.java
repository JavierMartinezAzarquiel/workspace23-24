package entidades;


public class Grupo{
    private int IdGrupo;
    private String NomGrupo;

    public Grupo(int IdGrupo, String NomGrupo){
        this.IdGrupo = IdGrupo;
        this.NomGrupo = NomGrupo;
    }

    public int getIdGrupo(){
        return IdGrupo;
    }

    public void setIdGrupo(int IdGrupo){
        this.IdGrupo = IdGrupo;
    }

    public String getNomGrupo(){
        return NomGrupo;
    }

    public void setNomGrupo(String NomGrupo){
        this.NomGrupo = NomGrupo;
    }

}
