package kz.site.helloworld.mapper;

import kz.site.helloworld.domain.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PageMapper
{
    @Select ( "SELECT message FROM site FETCH FIRST 1 ROWS ONLY" )
    Page getSiteMessage ( );
}