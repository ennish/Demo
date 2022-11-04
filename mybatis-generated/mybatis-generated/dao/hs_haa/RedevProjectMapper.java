package mybatis-generated.dao.hs_haa;

import java.util.List;
import mybatis_generate.model.hs_haa.RedevProject;
import mybatis_generate.model.hs_haa.RedevProjectExample;
import org.apache.ibatis.annotations.Param;

public interface RedevProjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    long countByExample(RedevProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    int deleteByExample(RedevProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    int deleteByPrimaryKey(String rpPrjCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    int insert(RedevProject row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    int insertSelective(RedevProject row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    List<RedevProject> selectByExample(RedevProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    RedevProject selectByPrimaryKey(String rpPrjCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    int updateByExampleSelective(@Param("row") RedevProject row, @Param("example") RedevProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    int updateByExample(@Param("row") RedevProject row, @Param("example") RedevProjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    int updateByPrimaryKeySelective(RedevProject row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    int updateByPrimaryKey(RedevProject row);
}