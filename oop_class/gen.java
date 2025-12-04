package oop_class;

import java.util.ArrayList;

public class gen {
    public static void main(String[] args) {
	gen_box<Integer> gb = new gen_box();
	gb.test(500000);
    }
}

class gen_box<K>{
    K result;
    ArrayList<K> all = null;
    public void test(K result) {
	this.all = new ArrayList<K>();
	this.all.add(result);
	System.out.println(this.all);
	//this.result = result;
	//System.out.println(result);
    }
}