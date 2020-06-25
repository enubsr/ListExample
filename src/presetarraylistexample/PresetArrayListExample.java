/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presetarraylistexample;

import doublylinkedlist.DNode;

/**
 *
 * @author Enubs
 */
public class PresetArrayListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DNode<String> node1 = new DNode<>(null, "node1", null);
        DNode<String> node2 = new DNode<>(null, "node2", null);
        DNode<String> node3 = new DNode<>(null, "node3", null);
        DNode<String> node4 = new DNode<>(null, "node4", null);
        DNode<String> node5 = new DNode<>(null, "node5", null);
        DNode<String> node6 = new DNode<>(null, "node6", null);
        DNode<String> node7 = new DNode<>(null, "node7", null);
        MyArrayList<DNode> list = new MyArrayList<>();
        try {
            list.add(0, node1);
            list.add(1, node2);
            list.add(2, node3);
            list.add(0, node4);
            list.add(1, node5);
            list.add(0, node6);
            list.add(6, node7);
            list.showList();
        } catch (InvalidIndexException e) {
            System.out.println(e.getMessage());
        }

    }

}
