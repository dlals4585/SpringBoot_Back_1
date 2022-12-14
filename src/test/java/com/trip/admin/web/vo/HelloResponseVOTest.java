package com.trip.admin.web.vo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseVOTest {
    @Test
    public void 롬북_기능_테스트(){
        //given
        String name = "test";
        int amount = 1001;

        //when
        HelloResponseDto vo = new HelloResponseDto(name, amount);

        //then
        assertThat(vo.getName()).isEqualTo(name);
        assertThat(vo.getAmount()).isEqualTo(amount);
    }
}
