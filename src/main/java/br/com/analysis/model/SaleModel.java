package br.com.analysis.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class SaleModel extends GenericModel {
  private String saleCode;
  private List<ItemModel> itens;
  private String sellerName;

  @Builder
  public SaleModel(String id, String saleCode, List<ItemModel> itens, String sellerName) {
    super(id);
    this.saleCode = saleCode;
    this.itens = itens;
    this.sellerName = sellerName;
  }
}
