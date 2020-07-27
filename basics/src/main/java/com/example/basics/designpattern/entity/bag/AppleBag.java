package com.example.basics.designpattern.entity.bag;

import com.example.basics.designpattern.entity.Bag;

/**
 * 苹果包装
 * Created by Peter on 10/9 009.
 */
public class AppleBag implements Bag {
    @Override
    public void pack() {
        System.out.print("--苹果使用纸箱包装");
    }
}
