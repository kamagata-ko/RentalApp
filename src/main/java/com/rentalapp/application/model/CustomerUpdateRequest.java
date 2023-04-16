package com.rentalapp.application.model;


import java.time.LocalDateTime;
import java.util.Date;


public record CustomerUpdateRequest(
        /* パスワード */
        String password,
        /* 名前 */
        String name,
        /* 性別 */
        int sex,
        /* 生年月日 */
        Date birthday,
        /* 更新日時 */
        LocalDateTime updateDate,
        /* 削除フラグ */
        int deleteFlg
) {

}
