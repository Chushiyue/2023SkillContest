package com.kob.backend.test;

public class Person {
    private Axe axe;
    public void setAxe(Axe axe) {
        this.axe = axe;
    }
    public void useAxe() {

        System.out.println("我要去砍柴！");
        System.out.println(axe.chop());
    }
}
