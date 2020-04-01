package test.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * @description:
 * @auther: gu.sc
 * @date: 2020/4/1 11:10
 */
public class testIterator {

  @Test
  public void test1() {
    //list的三种遍历方式
    List list = new ArrayList<>();
    list.add("s1");
    list.add("s2");
    list.add("s3");

    //迭代器遍历
    Iterator iterator = list.iterator();
    while (iterator.hasNext()) {
      Object next = iterator.next();
      System.out.println(next.toString());
    }
    //for循环 效率最高
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
    //foreach
    for(Object o : list){
      System.out.println(o.toString());
    }
  }
}
