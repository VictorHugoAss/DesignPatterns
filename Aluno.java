import java.util.ArrayList;
import java.util.List;

/** Aluno depende so da abstracao Disciplina (nenhum if por tipo de curso). */
public class Aluno {
    private final String nome;
    private final List<Disciplina> disciplinas = new ArrayList<>();

    public Aluno(String nome) { this.nome = nome; }

    public void adiciona(Disciplina d) { disciplinas.add(d); }

    public Resultado getResultadoGeral() {
        for (Disciplina d : disciplinas) {
            if (d.getResultado() == Resultado.REPROVADO) return Resultado.REPROVADO;
        }
        return Resultado.APROVADO;
    }

    public void imprimeBoletim() {
        System.out.println("Aluno: " + nome);
        for (Disciplina d : disciplinas) {
            System.out.println("  " + d.getNome() + ": " + d.getResultado());
        }
        System.out.println("  Resultado geral: " + getResultadoGeral());
    }
}
