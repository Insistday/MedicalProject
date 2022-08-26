package cn.ekgc.witmed.base.pojo.vo;

import java.io.Serializable;
import java.util.List;

/**
 * <b>分页视图列表</b>
 *
 * @author Administrator
 * @date 2022/8/26 0026
 */
public class PageVo<E extends BaseVO> implements Serializable {
	private static final long serialVersionUID = -1312260058981819009L;
	private Integer pageNum;
	private Integer pageSize;
	private List<E> list;
	private Long totalCount;
	private  Integer totalPage;

	public PageVo() {}

	public PageVo(Integer pageNum, Integer pageSize) {
		if(pageNum != null && pageNum > 0) {
			this.pageNum = pageNum;
		} else {
			this.pageNum = BaseConstants.PAGE_NUM;
		}
		if(pageSize != null && pageSize > 0 ){
			this.pageSize = pageSize;
		} else {
			this.pageSize = BaseConstants.PAGE_SIZE;
		}
	}
}
