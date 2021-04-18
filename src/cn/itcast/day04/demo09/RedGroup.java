package cn.itcast.day04.demo09;

import java.util.ArrayList;

public class RedGroup {
    public static void main(String[] args) {
        GroupAdministrator groupAdministrator = new GroupAdministrator("群主",100);

        ArrayList<Integer> arrayList = groupAdministrator.sendRandom(97,3);

        Member memberA = new Member("普通成员",0);
        Member memberB = new Member("普通成员",0);
        Member memberC = new Member("普通成员",0);
        memberA.receive(arrayList);
        memberB.receive(arrayList);
        memberC.receive(arrayList);
    }
}
