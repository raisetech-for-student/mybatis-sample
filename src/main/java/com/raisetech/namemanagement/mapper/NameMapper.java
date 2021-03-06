package com.raisetech.namemanagement.mapper;

import com.raisetech.namemanagement.entity.Name;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface NameMapper {

  @Select("SELECT * FROM names")
  List<Name> findAll();

  @Select("SELECT * FROM names WHERE id = #{id}")
  Optional<Name> findById(int id);
}
