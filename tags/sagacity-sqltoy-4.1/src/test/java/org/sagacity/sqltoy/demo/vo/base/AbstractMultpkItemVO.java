/**
 *@Generated by QuickVO Tools 1.6
 */
package org.sagacity.sqltoy.demo.vo.base;

import java.io.Serializable;

import org.sagacity.sqltoy.config.annotation.Column;
import org.sagacity.sqltoy.config.annotation.Entity;
import org.sagacity.sqltoy.config.annotation.Id;


/**
 * @project sqltoy-orm
 * @version 1.0.0
 * 多外键子表    			
 * MultpkItemVO generated by TEST_MULTPK_ITEM
 */
@Entity(tableName="TEST_MULTPK_ITEM")
public abstract class AbstractMultpkItemVO implements Serializable,
	java.lang.Cloneable {
	 /*--------------- properties string,handier to copy ---------------------*/
	 //full properties 
	 //goodsNo,bizType,batchNo,quantity,price
	 
	 //not null properties
	 //goodsNo,quantity,price

	/**
	 * 商品编号
	 */
	@Id(strategy="generator",generator="org.sagacity.sqltoy.plugin.DefaultGenerator")
	@Column(name="GOODS_NO",length=20L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String goodsNo;
	
	/**
	 * 业务分类编号
	 */
	@Column(name="BIZ_TYPE",length=20L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String bizType;
	
	/**
	 * 批次号
	 */
	@Column(name="BATCH_NO",length=10L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String batchNo;
	
	/**
	 * 商品数量
	 */
	@Column(name="QUANTITY",length=4L,type=java.sql.Types.INTEGER,nullable=false)
	protected Integer quantity;
	
	/**
	 * 单价
	 */
	@Column(name="PRICE",length=6L,type=java.sql.Types.DOUBLE,nullable=false)
	protected Double price;
	


	/** default constructor */
	public AbstractMultpkItemVO() {
	}
	
	/** pk constructor */
	public AbstractMultpkItemVO(String goodsNo)
	{
		this.goodsNo=goodsNo;
	}

	/** minimal constructor */
	public AbstractMultpkItemVO(String goodsNo,Integer quantity,Double price)
	{
		this.goodsNo=goodsNo;
		this.quantity=quantity;
		this.price=price;
	}

	/** full constructor */
	public AbstractMultpkItemVO(String goodsNo,String bizType,String batchNo,Integer quantity,Double price)
	{
		this.goodsNo=goodsNo;
		this.bizType=bizType;
		this.batchNo=batchNo;
		this.quantity=quantity;
		this.price=price;
	}
	
	/**
	 *@param goodsNo the goodsNo to set
	 */
	public void setGoodsNo(String goodsNo) {
		this.goodsNo=goodsNo;
	}
		
	/**
	 *@return the GoodsNo
	 */
	public String getGoodsNo() {
	    return this.goodsNo;
	}
	
	/**
	 *@param bizType the bizType to set
	 */
	public void setBizType(String bizType) {
		this.bizType=bizType;
	}
		
	/**
	 *@return the BizType
	 */
	public String getBizType() {
	    return this.bizType;
	}
	
	/**
	 *@param batchNo the batchNo to set
	 */
	public void setBatchNo(String batchNo) {
		this.batchNo=batchNo;
	}
		
	/**
	 *@return the BatchNo
	 */
	public String getBatchNo() {
	    return this.batchNo;
	}
	
	/**
	 *@param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity=quantity;
	}
		
	/**
	 *@return the Quantity
	 */
	public Integer getQuantity() {
	    return this.quantity;
	}
	
	/**
	 *@param price the price to set
	 */
	public void setPrice(Double price) {
		this.price=price;
	}
		
	/**
	 *@return the Price
	 */
	public Double getPrice() {
	    return this.price;
	}




	/**
     * @todo vo columns to String
     */
	public String toString() {
		StringBuffer columnsBuffer=new StringBuffer();
		columnsBuffer.append("goodsNo=").append(getGoodsNo()).append("\n");
		columnsBuffer.append("bizType=").append(getBizType()).append("\n");
		columnsBuffer.append("batchNo=").append(getBatchNo()).append("\n");
		columnsBuffer.append("quantity=").append(getQuantity()).append("\n");
		columnsBuffer.append("price=").append(getPrice()).append("\n");
		return columnsBuffer.toString();
	}
}
