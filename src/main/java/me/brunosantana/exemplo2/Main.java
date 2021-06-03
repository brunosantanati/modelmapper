package me.brunosantana.exemplo2;

import org.modelmapper.ModelMapper;

public class Main {

    public static void main(String[] args) {
        teste1();
        teste2();
    }

    private static void teste1() {
        var a = new ClasseA("eq1", "eq2", "dif1", "dif2");

        ModelMapper modelMapper = new ModelMapper();
        //mapeando os campos explicitamente(somente os que não podem ser inferidos pelo ModelMapper)
        modelMapper.typeMap(ClasseA.class, ClasseB.class).addMappings(mapper -> {
            mapper.map(src -> src.getDiferente1(),
                    ClasseB::setAlgo1);
            mapper.map(src -> src.getDiferente2(),
                    ClasseB::setAlgo2);
        });

        var b = modelMapper.map(a, ClasseB.class);
        b.setSemCorrespondencia("oh muleke");

        System.out.println(a);
        System.out.println(b);
    }

    private static void teste2() {
        var a = new ClasseA("eq1", "eq2", "dif1", "dif2");

        ModelMapper modelMapper = new ModelMapper();
        //mapeando os campos explicitamente(somente os que não podem ser inferidos pelo ModelMapper)
        modelMapper.typeMap(ClasseA.class, ClasseB.class).addMappings(mapper -> {
            mapper.map(ClasseA::getDiferente1, ClasseB::setAlgo1);
            mapper.map(ClasseA::getDiferente2, ClasseB::setAlgo2);
            mapper.map(src -> "uhuuuuu", ClasseB::setSemCorrespondencia); //deixar fixo direto no mapeamento
        });

        var b = modelMapper.map(a, ClasseB.class);
        //b.setSemCorrespondencia("uhuuuu");

        System.out.println(a);
        System.out.println(b);
    }

}
