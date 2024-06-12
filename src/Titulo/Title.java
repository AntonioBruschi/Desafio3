package Titulo;

public class Title implements Comparable<Title>{
    private String name;

    public Title(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "nome='" + this.getName() + '\'' +
                '}';
    }

    @Override //método para comparar
    public int compareTo(Title o) {
        return this.getName().compareTo(o.getName());
    }
}
