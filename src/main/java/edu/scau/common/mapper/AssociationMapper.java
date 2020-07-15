package edu.scau.common.mapper;

import edu.scau.common.pojo.Association;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description: 社团资料
 * @author: whj
 * @create: 2020-07-14 20:52
 **/
@Mapper
public interface AssociationMapper {
    Association getAssociationByName(String associationName);
    List<Association> getAssociationByType(int type);
    Integer updateAssociation(Association association);
    Integer insertAssociation(Association association);
}
