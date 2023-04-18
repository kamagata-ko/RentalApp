package com.rentalapp.domain.model;

import java.time.LocalDateTime;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerModel {
	/* ID */
	private int id;
	/* パスワード */
	private String password;
	/* 名前 */
	private String name;
	/* 性別 */
	private int sex;
	/* 生年月日 */
	private Date birthday;
	/* 登録日時 */
	private LocalDateTime registerDate;
	/* 更新日時 */
	private LocalDateTime updateDate;
	/* 削除フラグ */
	private int deleteFlg;
}
