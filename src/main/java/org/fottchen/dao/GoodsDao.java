package org.fottchen.dao;

import org.fottchen.po.Goods;

public interface GoodsDao {
	
	Integer insert(Goods goods);
	
	void update(Goods goods);
	
}
