package com.rentalapp.application.helper;

import com.rentalapp.application.model.CustomerRequest;
import com.rentalapp.application.model.CustomerResponse;
import com.rentalapp.domain.model.CustomerModel;

/**
 * 顧客APIヘルパー
 */
public interface CustomerHelper {

	/**
	 * 顧客APIリクエストから顧客モデルへ変換.
	 * @param req 顧客APIリクエスト
	 * @return 顧客モデル
	 */
	CustomerModel toModel(CustomerRequest req);

	/**
	 * 顧客モデルから顧客APIレスポンスへ変換.
	 *
	 * @param model 顧客モデル
	 * @return 顧客APIレスポンス
	 */
	CustomerResponse toResponse(CustomerModel model);

}
