package com.sb.SpringBootJune2026.afterspring.controller;


interface LBF {
    String getHeight();
}

interface AC extends LBF {

}

interface CAC extends AC {
    CLBF getBeanFactory() throws IllegalStateException;
}

abstract class AAC implements CAC {


    @Override
    public String getHeight() {
        return getBeanFactory().getHeight();
    }

    @Override
    public abstract CLBF getBeanFactory() throws IllegalStateException;

}


class GAC extends AAC {
    private final DLBF beanFactory;

    public GAC(DLBF beanFactory) {
        this.beanFactory = beanFactory;
    }

    @Override
    public final CLBF getBeanFactory() {
        return this.beanFactory;
    }

}

class GWAC extends GAC {

    public GWAC(DLBF beanFactory) {
        super(beanFactory);
    }

}

class SWSAC extends GWAC {

    public SWSAC(DLBF beanFactory) {
        super(beanFactory);
    }

}

class ACSWSAC extends SWSAC {

    public ACSWSAC(DLBF beanFactory) {
        super(beanFactory);
    }

}

public class GetBeanDefinitionNamesFlowExample {

    public static void main(String[] args) {

        CAC ctx = run();
        String height = ctx.getHeight();
        System.out.println("height: " + height);

    }

    public static CAC run() {

        DLBF beanFactory = new DLBF();

        return new ACSWSAC(beanFactory);
    }


}

/// /////////////////////////////


interface CLBF extends LBF {

}

// actual object
class DLBF implements CLBF {
    @Override
    public String getHeight() {
        return "5.9";
    }
}
