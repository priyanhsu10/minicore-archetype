#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controllers;


import minicore.contracts.ControllerBase;
import minicore.contracts.annotations.http.*;

@Route(path = "/account")
public class AccountController extends ControllerBase {
    @Get
    public String get() {
        return "welcome";
    }
    @Post
    public String post(String name){
        return "this is post "+name;
    }
    @Put
    public String put(String name){
        return "this is post "+name;
    }
    @Delete
    public String delete(String name){
        return "this is post "+name;
    }
}
