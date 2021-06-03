package com.javarush.task.task21.task2108;

/* 
Клонирование растений
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String[] branches = new String[4];
        for (int i = 0; i < branches.length; i++) {
            branches[i] = "" + i;

        }
        Tree tree = new Tree("willow", branches);
        Tree clone = null;
        try {
            clone = (Tree) tree.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(tree);
        System.out.println(clone);

        for (String br: tree.branches) {
            System.out.println(br);
        }
        System.out.println("");

        clone.branches[0] = "" + 1;
        for (String br: clone.branches) {
            System.out.println(br);
        }
//        System.out.println(tree.branches);
//        System.out.println(clone.branches);
    }

    public static class Plant {
        private String name;

        public Plant(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }


    }

    public static class Tree extends Plant implements Cloneable{
        private String[] branches;

        public Tree(String name, String[] branches) {
            super(name);
            this.branches = branches;
        }

        public String[] getBranches() {
            return branches;
        }

        @Override
        public String toString() {
            return super.getName();
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Tree tree = new Tree(getName(), branches.clone()); // String у нас Immutable

            return tree;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Tree)) return false;
            Tree tree = (Tree) o;
            return Arrays.equals(branches, tree.branches);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(branches);
        }


    }
}
