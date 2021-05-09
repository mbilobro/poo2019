
public class Principal {

    public static void main(String[] args) {

        Contato c1 = new Contato();
        c1.setNome("Matheus");

        Endereco e1 = new Endereco();
        e1.setRua("Av. Carlos Cavalcanti");
        e1.setNumero("1288");
        e1.setComplemento("Apto 3");
        c1.setEndereco(e1);

        Telefone t1 = new Telefone();
        t1.setTipo("Celular");
        t1.setDdd("042");
        t1.setNumero("98401-3977");

        Telefone t2 = new Telefone();
        t2.setTipo("Casa");
        t2.setDdd("042");
        t2.setNumero("3223-2457");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = t1;
        telefones[1] = t2;

        c1.setTelefones(telefones);

        Contato c2 = new Contato();
        c2.setNome("Marcelo");

        Endereco e2 = new Endereco();
        e2.setRua("Av. Carlos Cavalcanti");
        e2.setNumero("1290");
        e2.setComplemento("Apto 21");
        c2.setEndereco(e2);

        Telefone t3 = new Telefone();
        t3.setTipo("Celular");
        t3.setDdd("042");
        t3.setNumero("99101-0161");

        Telefone t4 = new Telefone();
        t4.setTipo("Comercial");
        t4.setDdd("042");
        t4.setNumero("3220-3233");

        Telefone[] telefones1 = new Telefone[2];
        telefones1[0] = t3;
        telefones1[1] = t4;

        c2.setTelefones(telefones1);

        System.out.println(c1.getNome() + "\n");
        System.out.println(c1.getEndereco().getRua() + ", " + c1.getEndereco().getNumero() + "\n");
        for (Telefone t : c1.getTelefones()) {
            System.out.println(t.getTipo() + ": " + t.getDdd() + " - " + t.getNumero() + "\n");
        }

        System.out.println(c2.getNome() + "\n");
        System.out.println(c2.getEndereco().getRua() + ", " + c2.getEndereco().getNumero() + "\n");
        for (Telefone t : c2.getTelefones()) {
            System.out.println(t.getTipo() + ": " + t.getDdd() + " - " + t.getNumero() + "\n");
        }
    }

}
