package com.wonders.fzb.platform.services;

import java.util.List;
import java.util.Map;

import com.wonders.fzb.base.beans.Page;
import com.wonders.fzb.platform.beans.ResInfo;

/**
 * WFC_F_RES_INFO业务接口
 * 
 * @author scalffold
 * 
 */
public interface ResInfoService {
	/**
	 * 添加实体对象
	 * 
	 * @param resInfo
	 */
	public void add(ResInfo resInfo);

	/**
	 * 更新实体对象
	 * 
	 * @param resInfo
	 */
	public void update(ResInfo resInfo);
	
	/**
	 * 删除实体对象
	 * 
	 * @param resInfo
	 */
	public void delete(String id);

	/**
	 * 
	 * 通过ID装载相应的对象实例，如果对应的实体不存在，返回null
	 * 
	 * @param id 主键
	 * @return
	 */
	public ResInfo findById(String id);

	/**
	 * 根据分页参数进行分页查询.
	 * 
	 * @param pageNo
	 *            当前页码
	 * @param pageSize
	 *            每页显示记录数.
	 * @return
	 */
	public Page findByPage(int pageNo, int pageSize);

	/**
	 * 根据Map中过滤条件、排序条件和分页参数进行分页查询.
	 * 
	 * @param condMap
	 *            过滤条件<propertyName,properyValue>
	 * @param sortMap
	 *            排序条件<propertyName,properyValue>
	 * @param pageNo
	 *            当前页码
	 * @param pageSize
	 *            每页显示记录数.
	 * @return
	 */
	public Page findByPage(Map<String, Object> condMap,
			Map<String, String> sortMap, int pageNo, int pageSize);


	/**
	 * 根据Map中过滤条件、排序条件进行查询.
	 * 
	 * @param condMap
	 *            过滤条件<propertyName,properyValue>
	 * @param sortMap
	 *            排序条件<propertyName,properyValue>
	 * @return
	 */
	public List<ResInfo> findByList(Map<String, Object> condMap,
			Map<String, String> sortMap);

}
