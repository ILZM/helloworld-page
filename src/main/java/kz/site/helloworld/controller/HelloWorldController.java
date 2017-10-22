package kz.site.helloworld.controller;

import kz.site.helloworld.mapper.PageMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@MapperScan( "kz.site.helloworld.mapper" )
public class HelloWorldController
{
    @Autowired
    private PageMapper pageMapper;

    @GetMapping( "/api/message" )
    public ResponseEntity < ? > sendMessage ( )
    {
        return ResponseEntity.ok ( this.pageMapper.getSiteMessage ( ) );
    }
}