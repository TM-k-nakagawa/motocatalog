package jp.co.planaria.sample.bean;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

/**
 * バイク
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Motorcycle {

    // バイク番号
    private Integer motoNo;
    // バイク名
    private String motoName;
    // シート高
    private Integer seatHeight;
    // シリンダー
    private Integer cylinder;
    // 冷却
    private String cooling;
    // 価格
    private Integer price;
    // コメント
    private String comment;
    // ブランド
    private Brand brand;
    // バーション
    private Integer version;
    // 登録日時
    private LocalDateTime insDt;
    // 更新日時
    private LocalDateTime updDt;

}