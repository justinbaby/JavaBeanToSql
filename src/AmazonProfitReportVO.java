
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class AmazonProfitReportVO implements Serializable {

    private Long totalFbaAndFbmQuantity;
    private BigDecimal totalFbaAndFbmAmount;
    private Long totalSalesQuantity;
    private Long fbaSalesQuantity;
    private Long fbmSalesQuantity;
    private Long totalReshipQuantity;
    private Long reshipFbmProductSalesQuantity;
    private Long reshipFbmProductSaleRefundsQuantity;
    private Long reshipFbaProductSalesQuantity;
    private Long reshipFbaProductSaleRefundsQuantity;
    private Long mcFbaFulfillmentFeesQuantity;
    private Long fbaInventoryCreditQuantity;
    private Long disposalQuantity;
    private Long removalQuantity;
    private BigDecimal totalAdsSales;
    private BigDecimal adsSdSales;
    private BigDecimal adsSpSales;
    private BigDecimal sharedAdsSbSales;
    private BigDecimal sharedAdsSbvSales;
    private Long totalAdsSalesQuantity;
    private Long adsSdSalesQuantity;
    private Long adsSpSalesQuantity;
    private Long sharedAdsSbSalesQuantity;
    private Long sharedAdsSbvSalesQuantity;
    private BigDecimal totalSalesAmount;
    private BigDecimal fbaSaleAmount;
    private BigDecimal fbmSaleAmount;
    private BigDecimal shippingCredits;
    private BigDecimal promotionalRebates;
    private BigDecimal fbaInventoryCredit;
    private BigDecimal cashOnDelivery;
    private BigDecimal otherInAmount;
    private BigDecimal fbaLiquidationProceeds;
    private BigDecimal fbaLiquidationProceedsAdjustments;
    private BigDecimal amazonShippingReimbursement;
    private BigDecimal safeTReimbursement;
    private BigDecimal netcoTransaction;
    private BigDecimal reimbursements;
    private BigDecimal clawbacks;
    private BigDecimal sharedComminglingVatIncome;
    private BigDecimal giftWrapCredits;
    private BigDecimal guaranteeClaims;
    private BigDecimal costOfPoLongegersGranted;
    private BigDecimal others;
    private BigDecimal totalSalesRefunds;
    private BigDecimal fbaSalesRefunds;
    private BigDecimal fbmSalesRefunds;
    private BigDecimal shippingCreditRefunds;
    private BigDecimal giftWrapCreditRefunds;
    private BigDecimal chargebacks;
    private BigDecimal costOfPoLongegersReturned;
    private BigDecimal promotionalRebateRefunds;
    private BigDecimal totalFeeRefunds;
    private BigDecimal sellingFeeRefunds;
    private BigDecimal fbaTransactionFeeRefunds;
    private BigDecimal refundAdministrationFees;
    private BigDecimal otherTransactionFeeRefunds;
    private BigDecimal refundForAdvertiser;
    private BigDecimal poLongsAdjusted;
    private BigDecimal shippingLabelRefunds;
    private Long refundsQuantity;
    private BigDecimal refundsRate;
    private Long fbaReturnsQuantity;
    private Long fbaReturnsSaleableQuantity;
    private Long fbaReturnsUnsaleableQuantity;
    private BigDecimal fbaReturnsQuantityRate;
    private BigDecimal platformFee;
    private BigDecimal totalFbaDeliveryFee;
    private BigDecimal fbaDeliveryFee;
    private BigDecimal mcFbaDeliveryFee;
    private BigDecimal otherTransactionFees;
    private BigDecimal totalAdsCost;
    private BigDecimal adsSpCost;
    private BigDecimal adsSbCost;
    private BigDecimal adsSbvCost;
    private BigDecimal adsSdCost;
    private BigDecimal sharedCostOfAdvertising;
    private BigDecimal promotionFee;
    private BigDecimal sharedSubscriptionFee;
    private BigDecimal sharedLdFee;
    private BigDecimal sharedCouponFee;
    private BigDecimal sharedEarlyReviewerProgramFee;
    private BigDecimal sharedVineFee;
    private BigDecimal totalStorageFee;
    private BigDecimal fbaStorageFee;
    private BigDecimal sharedFbaStorageFee;
    private BigDecimal longTermStorageFee;
    private BigDecimal sharedLongTermStorageFee;
    private BigDecimal sharedStorageRenewalBilling;
    private BigDecimal sharedFbaDisposalFee;
    private BigDecimal sharedFbaRemovalFee;
    private BigDecimal sharedFbaInboundTransportationProgramFee;
    private BigDecimal sharedLabelingFee;
    private BigDecimal sharedPolybaggingFee;
    private BigDecimal sharedBubblewrapFee;
    private BigDecimal sharedTapingFee;
    private BigDecimal sharedFbaCustomerReturnFee;
    private BigDecimal sharedFbaInboundDefectFee;
    private BigDecimal sharedFbaOverageFee;
    private BigDecimal sharedAmazonPartneredCarrierShipmentFee;
    private BigDecimal sharedFbaInboundConvenienceFee;
    private BigDecimal sharedItemFeeAdjustment;
    private BigDecimal sharedOtherFbaInventoryFees;
    private BigDecimal fbaStorageFeeAccrual;
    private BigDecimal fbaStorageFeeAccrualDifference;
    private BigDecimal longTermStorageFeeAccrual;
    private BigDecimal longTermStorageFeeAccrualDifference;
    private BigDecimal sharedFbaLongegerernationalInboundFee;
    private BigDecimal adjustments;
    private BigDecimal totalPlatformOtherFee;
    private BigDecimal shippingLabelPurchases;
    private BigDecimal sharedCarrierShippingLabelAdjustments;
    private BigDecimal sharedLiquidationsFees;
    private BigDecimal sharedManualProcessingFee;
    private BigDecimal sharedOtherServiceFees;
    private BigDecimal totalSalesTax;
    private BigDecimal taxCollected;
    private BigDecimal tcsIgstCollected;
    private BigDecimal tcsSgstCollected;
    private BigDecimal tcsCgstCollected;
    private BigDecimal sharedComminglingVatExpenses;
    private BigDecimal salesTaxRefund;
    private BigDecimal taxRefunded;
    private BigDecimal tcsIgstRefunded;
    private BigDecimal tcsSgstRefunded;
    private BigDecimal tcsCgstRefunded;
    private BigDecimal salesTaxWithheld;
    private BigDecimal refundTaxWithheld;
    private BigDecimal tdsSection194ONet;
    private BigDecimal cgPriceTotal;
    private Long hasCgPriceDetail;
    private BigDecimal cgUnitPrice;
    private BigDecimal proportionOfCg;
    private BigDecimal cgTransportCostsTotal;
    private Long hasCgTransportCostsDetail;
    private BigDecimal cgTransportUnitCosts;
    private BigDecimal proportionOfCgTransport;
    private BigDecimal totalCost;
    private BigDecimal proportionOfTotalCost;
    private BigDecimal cgOtherCostsTotal;
    private BigDecimal cgOtherUnitCosts;
    private Long hasCgOtherCostsDetail;
    private BigDecimal proportionOfCgOtherCosts;
    private BigDecimal grossProfit;
    private BigDecimal grossRate;
    private BigDecimal customOrderFee;
    private Long id;
    private String sid;
    private String postedDateLocale;
    private Boolean isDisplayDetail;
    private String smallImageUrl;
    private String msku;
    private String asin;
    private String parentAsin;
    private String storeName;
    private String country;
    private String countryCode;
    private String localName;
    private String localSku;
    private String itemName;
    private Object principalRealname;
    private Object productDeveloperRealname;
    private String categoryName;
    private String brandName;
    private String currencyCode;
    private String currencyIcon;
    private String listingTagIds;
    private List<OtherFeeStrBean> otherFeeStr;

    public Long getTotalFbaAndFbmQuantity() {
        return totalFbaAndFbmQuantity;
    }

    public void setTotalFbaAndFbmQuantity(Long totalFbaAndFbmQuantity) {
        this.totalFbaAndFbmQuantity = totalFbaAndFbmQuantity;
    }

    public BigDecimal getTotalFbaAndFbmAmount() {
        return totalFbaAndFbmAmount;
    }

    public void setTotalFbaAndFbmAmount(BigDecimal totalFbaAndFbmAmount) {
        this.totalFbaAndFbmAmount = totalFbaAndFbmAmount;
    }

    public Long getTotalSalesQuantity() {
        return totalSalesQuantity;
    }

    public void setTotalSalesQuantity(Long totalSalesQuantity) {
        this.totalSalesQuantity = totalSalesQuantity;
    }

    public Long getFbaSalesQuantity() {
        return fbaSalesQuantity;
    }

    public void setFbaSalesQuantity(Long fbaSalesQuantity) {
        this.fbaSalesQuantity = fbaSalesQuantity;
    }

    public Long getFbmSalesQuantity() {
        return fbmSalesQuantity;
    }

    public void setFbmSalesQuantity(Long fbmSalesQuantity) {
        this.fbmSalesQuantity = fbmSalesQuantity;
    }

    public Long getTotalReshipQuantity() {
        return totalReshipQuantity;
    }

    public void setTotalReshipQuantity(Long totalReshipQuantity) {
        this.totalReshipQuantity = totalReshipQuantity;
    }

    public Long getReshipFbmProductSalesQuantity() {
        return reshipFbmProductSalesQuantity;
    }

    public void setReshipFbmProductSalesQuantity(Long reshipFbmProductSalesQuantity) {
        this.reshipFbmProductSalesQuantity = reshipFbmProductSalesQuantity;
    }

    public Long getReshipFbmProductSaleRefundsQuantity() {
        return reshipFbmProductSaleRefundsQuantity;
    }

    public void setReshipFbmProductSaleRefundsQuantity(Long reshipFbmProductSaleRefundsQuantity) {
        this.reshipFbmProductSaleRefundsQuantity = reshipFbmProductSaleRefundsQuantity;
    }

    public Long getReshipFbaProductSalesQuantity() {
        return reshipFbaProductSalesQuantity;
    }

    public void setReshipFbaProductSalesQuantity(Long reshipFbaProductSalesQuantity) {
        this.reshipFbaProductSalesQuantity = reshipFbaProductSalesQuantity;
    }

    public Long getReshipFbaProductSaleRefundsQuantity() {
        return reshipFbaProductSaleRefundsQuantity;
    }

    public void setReshipFbaProductSaleRefundsQuantity(Long reshipFbaProductSaleRefundsQuantity) {
        this.reshipFbaProductSaleRefundsQuantity = reshipFbaProductSaleRefundsQuantity;
    }

    public Long getMcFbaFulfillmentFeesQuantity() {
        return mcFbaFulfillmentFeesQuantity;
    }

    public void setMcFbaFulfillmentFeesQuantity(Long mcFbaFulfillmentFeesQuantity) {
        this.mcFbaFulfillmentFeesQuantity = mcFbaFulfillmentFeesQuantity;
    }

    public Long getFbaInventoryCreditQuantity() {
        return fbaInventoryCreditQuantity;
    }

    public void setFbaInventoryCreditQuantity(Long fbaInventoryCreditQuantity) {
        this.fbaInventoryCreditQuantity = fbaInventoryCreditQuantity;
    }

    public Long getDisposalQuantity() {
        return disposalQuantity;
    }

    public void setDisposalQuantity(Long disposalQuantity) {
        this.disposalQuantity = disposalQuantity;
    }

    public Long getRemovalQuantity() {
        return removalQuantity;
    }

    public void setRemovalQuantity(Long removalQuantity) {
        this.removalQuantity = removalQuantity;
    }

    public BigDecimal getTotalAdsSales() {
        return totalAdsSales;
    }

    public void setTotalAdsSales(BigDecimal totalAdsSales) {
        this.totalAdsSales = totalAdsSales;
    }

    public BigDecimal getAdsSdSales() {
        return adsSdSales;
    }

    public void setAdsSdSales(BigDecimal adsSdSales) {
        this.adsSdSales = adsSdSales;
    }

    public BigDecimal getAdsSpSales() {
        return adsSpSales;
    }

    public void setAdsSpSales(BigDecimal adsSpSales) {
        this.adsSpSales = adsSpSales;
    }

    public BigDecimal getSharedAdsSbSales() {
        return sharedAdsSbSales;
    }

    public void setSharedAdsSbSales(BigDecimal sharedAdsSbSales) {
        this.sharedAdsSbSales = sharedAdsSbSales;
    }

    public BigDecimal getSharedAdsSbvSales() {
        return sharedAdsSbvSales;
    }

    public void setSharedAdsSbvSales(BigDecimal sharedAdsSbvSales) {
        this.sharedAdsSbvSales = sharedAdsSbvSales;
    }

    public Long getTotalAdsSalesQuantity() {
        return totalAdsSalesQuantity;
    }

    public void setTotalAdsSalesQuantity(Long totalAdsSalesQuantity) {
        this.totalAdsSalesQuantity = totalAdsSalesQuantity;
    }

    public Long getAdsSdSalesQuantity() {
        return adsSdSalesQuantity;
    }

    public void setAdsSdSalesQuantity(Long adsSdSalesQuantity) {
        this.adsSdSalesQuantity = adsSdSalesQuantity;
    }

    public Long getAdsSpSalesQuantity() {
        return adsSpSalesQuantity;
    }

    public void setAdsSpSalesQuantity(Long adsSpSalesQuantity) {
        this.adsSpSalesQuantity = adsSpSalesQuantity;
    }

    public Long getSharedAdsSbSalesQuantity() {
        return sharedAdsSbSalesQuantity;
    }

    public void setSharedAdsSbSalesQuantity(Long sharedAdsSbSalesQuantity) {
        this.sharedAdsSbSalesQuantity = sharedAdsSbSalesQuantity;
    }

    public Long getSharedAdsSbvSalesQuantity() {
        return sharedAdsSbvSalesQuantity;
    }

    public void setSharedAdsSbvSalesQuantity(Long sharedAdsSbvSalesQuantity) {
        this.sharedAdsSbvSalesQuantity = sharedAdsSbvSalesQuantity;
    }

    public BigDecimal getTotalSalesAmount() {
        return totalSalesAmount;
    }

    public void setTotalSalesAmount(BigDecimal totalSalesAmount) {
        this.totalSalesAmount = totalSalesAmount;
    }

    public BigDecimal getFbaSaleAmount() {
        return fbaSaleAmount;
    }

    public void setFbaSaleAmount(BigDecimal fbaSaleAmount) {
        this.fbaSaleAmount = fbaSaleAmount;
    }

    public BigDecimal getFbmSaleAmount() {
        return fbmSaleAmount;
    }

    public void setFbmSaleAmount(BigDecimal fbmSaleAmount) {
        this.fbmSaleAmount = fbmSaleAmount;
    }

    public BigDecimal getShippingCredits() {
        return shippingCredits;
    }

    public void setShippingCredits(BigDecimal shippingCredits) {
        this.shippingCredits = shippingCredits;
    }

    public BigDecimal getPromotionalRebates() {
        return promotionalRebates;
    }

    public void setPromotionalRebates(BigDecimal promotionalRebates) {
        this.promotionalRebates = promotionalRebates;
    }

    public BigDecimal getFbaInventoryCredit() {
        return fbaInventoryCredit;
    }

    public void setFbaInventoryCredit(BigDecimal fbaInventoryCredit) {
        this.fbaInventoryCredit = fbaInventoryCredit;
    }

    public BigDecimal getCashOnDelivery() {
        return cashOnDelivery;
    }

    public void setCashOnDelivery(BigDecimal cashOnDelivery) {
        this.cashOnDelivery = cashOnDelivery;
    }

    public BigDecimal getOtherInAmount() {
        return otherInAmount;
    }

    public void setOtherInAmount(BigDecimal otherInAmount) {
        this.otherInAmount = otherInAmount;
    }

    public BigDecimal getFbaLiquidationProceeds() {
        return fbaLiquidationProceeds;
    }

    public void setFbaLiquidationProceeds(BigDecimal fbaLiquidationProceeds) {
        this.fbaLiquidationProceeds = fbaLiquidationProceeds;
    }

    public BigDecimal getFbaLiquidationProceedsAdjustments() {
        return fbaLiquidationProceedsAdjustments;
    }

    public void setFbaLiquidationProceedsAdjustments(BigDecimal fbaLiquidationProceedsAdjustments) {
        this.fbaLiquidationProceedsAdjustments = fbaLiquidationProceedsAdjustments;
    }

    public BigDecimal getAmazonShippingReimbursement() {
        return amazonShippingReimbursement;
    }

    public void setAmazonShippingReimbursement(BigDecimal amazonShippingReimbursement) {
        this.amazonShippingReimbursement = amazonShippingReimbursement;
    }

    public BigDecimal getSafeTReimbursement() {
        return safeTReimbursement;
    }

    public void setSafeTReimbursement(BigDecimal safeTReimbursement) {
        this.safeTReimbursement = safeTReimbursement;
    }

    public BigDecimal getNetcoTransaction() {
        return netcoTransaction;
    }

    public void setNetcoTransaction(BigDecimal netcoTransaction) {
        this.netcoTransaction = netcoTransaction;
    }

    public BigDecimal getReimbursements() {
        return reimbursements;
    }

    public void setReimbursements(BigDecimal reimbursements) {
        this.reimbursements = reimbursements;
    }

    public BigDecimal getClawbacks() {
        return clawbacks;
    }

    public void setClawbacks(BigDecimal clawbacks) {
        this.clawbacks = clawbacks;
    }

    public BigDecimal getSharedComminglingVatIncome() {
        return sharedComminglingVatIncome;
    }

    public void setSharedComminglingVatIncome(BigDecimal sharedComminglingVatIncome) {
        this.sharedComminglingVatIncome = sharedComminglingVatIncome;
    }

    public BigDecimal getGiftWrapCredits() {
        return giftWrapCredits;
    }

    public void setGiftWrapCredits(BigDecimal giftWrapCredits) {
        this.giftWrapCredits = giftWrapCredits;
    }

    public BigDecimal getGuaranteeClaims() {
        return guaranteeClaims;
    }

    public void setGuaranteeClaims(BigDecimal guaranteeClaims) {
        this.guaranteeClaims = guaranteeClaims;
    }

    public BigDecimal getCostOfPoLongegersGranted() {
        return costOfPoLongegersGranted;
    }

    public void setCostOfPoLongegersGranted(BigDecimal costOfPoLongegersGranted) {
        this.costOfPoLongegersGranted = costOfPoLongegersGranted;
    }

    public BigDecimal getOthers() {
        return others;
    }

    public void setOthers(BigDecimal others) {
        this.others = others;
    }

    public BigDecimal getTotalSalesRefunds() {
        return totalSalesRefunds;
    }

    public void setTotalSalesRefunds(BigDecimal totalSalesRefunds) {
        this.totalSalesRefunds = totalSalesRefunds;
    }

    public BigDecimal getFbaSalesRefunds() {
        return fbaSalesRefunds;
    }

    public void setFbaSalesRefunds(BigDecimal fbaSalesRefunds) {
        this.fbaSalesRefunds = fbaSalesRefunds;
    }

    public BigDecimal getFbmSalesRefunds() {
        return fbmSalesRefunds;
    }

    public void setFbmSalesRefunds(BigDecimal fbmSalesRefunds) {
        this.fbmSalesRefunds = fbmSalesRefunds;
    }

    public BigDecimal getShippingCreditRefunds() {
        return shippingCreditRefunds;
    }

    public void setShippingCreditRefunds(BigDecimal shippingCreditRefunds) {
        this.shippingCreditRefunds = shippingCreditRefunds;
    }

    public BigDecimal getGiftWrapCreditRefunds() {
        return giftWrapCreditRefunds;
    }

    public void setGiftWrapCreditRefunds(BigDecimal giftWrapCreditRefunds) {
        this.giftWrapCreditRefunds = giftWrapCreditRefunds;
    }

    public BigDecimal getChargebacks() {
        return chargebacks;
    }

    public void setChargebacks(BigDecimal chargebacks) {
        this.chargebacks = chargebacks;
    }

    public BigDecimal getCostOfPoLongegersReturned() {
        return costOfPoLongegersReturned;
    }

    public void setCostOfPoLongegersReturned(BigDecimal costOfPoLongegersReturned) {
        this.costOfPoLongegersReturned = costOfPoLongegersReturned;
    }

    public BigDecimal getPromotionalRebateRefunds() {
        return promotionalRebateRefunds;
    }

    public void setPromotionalRebateRefunds(BigDecimal promotionalRebateRefunds) {
        this.promotionalRebateRefunds = promotionalRebateRefunds;
    }

    public BigDecimal getTotalFeeRefunds() {
        return totalFeeRefunds;
    }

    public void setTotalFeeRefunds(BigDecimal totalFeeRefunds) {
        this.totalFeeRefunds = totalFeeRefunds;
    }

    public BigDecimal getSellingFeeRefunds() {
        return sellingFeeRefunds;
    }

    public void setSellingFeeRefunds(BigDecimal sellingFeeRefunds) {
        this.sellingFeeRefunds = sellingFeeRefunds;
    }

    public BigDecimal getFbaTransactionFeeRefunds() {
        return fbaTransactionFeeRefunds;
    }

    public void setFbaTransactionFeeRefunds(BigDecimal fbaTransactionFeeRefunds) {
        this.fbaTransactionFeeRefunds = fbaTransactionFeeRefunds;
    }

    public BigDecimal getRefundAdministrationFees() {
        return refundAdministrationFees;
    }

    public void setRefundAdministrationFees(BigDecimal refundAdministrationFees) {
        this.refundAdministrationFees = refundAdministrationFees;
    }

    public BigDecimal getOtherTransactionFeeRefunds() {
        return otherTransactionFeeRefunds;
    }

    public void setOtherTransactionFeeRefunds(BigDecimal otherTransactionFeeRefunds) {
        this.otherTransactionFeeRefunds = otherTransactionFeeRefunds;
    }

    public BigDecimal getRefundForAdvertiser() {
        return refundForAdvertiser;
    }

    public void setRefundForAdvertiser(BigDecimal refundForAdvertiser) {
        this.refundForAdvertiser = refundForAdvertiser;
    }

    public BigDecimal getPoLongsAdjusted() {
        return poLongsAdjusted;
    }

    public void setPoLongsAdjusted(BigDecimal poLongsAdjusted) {
        this.poLongsAdjusted = poLongsAdjusted;
    }

    public BigDecimal getShippingLabelRefunds() {
        return shippingLabelRefunds;
    }

    public void setShippingLabelRefunds(BigDecimal shippingLabelRefunds) {
        this.shippingLabelRefunds = shippingLabelRefunds;
    }

    public Long getRefundsQuantity() {
        return refundsQuantity;
    }

    public void setRefundsQuantity(Long refundsQuantity) {
        this.refundsQuantity = refundsQuantity;
    }

    public BigDecimal getRefundsRate() {
        return refundsRate;
    }

    public void setRefundsRate(BigDecimal refundsRate) {
        this.refundsRate = refundsRate;
    }

    public Long getFbaReturnsQuantity() {
        return fbaReturnsQuantity;
    }

    public void setFbaReturnsQuantity(Long fbaReturnsQuantity) {
        this.fbaReturnsQuantity = fbaReturnsQuantity;
    }

    public Long getFbaReturnsSaleableQuantity() {
        return fbaReturnsSaleableQuantity;
    }

    public void setFbaReturnsSaleableQuantity(Long fbaReturnsSaleableQuantity) {
        this.fbaReturnsSaleableQuantity = fbaReturnsSaleableQuantity;
    }

    public Long getFbaReturnsUnsaleableQuantity() {
        return fbaReturnsUnsaleableQuantity;
    }

    public void setFbaReturnsUnsaleableQuantity(Long fbaReturnsUnsaleableQuantity) {
        this.fbaReturnsUnsaleableQuantity = fbaReturnsUnsaleableQuantity;
    }

    public BigDecimal getFbaReturnsQuantityRate() {
        return fbaReturnsQuantityRate;
    }

    public void setFbaReturnsQuantityRate(BigDecimal fbaReturnsQuantityRate) {
        this.fbaReturnsQuantityRate = fbaReturnsQuantityRate;
    }

    public BigDecimal getPlatformFee() {
        return platformFee;
    }

    public void setPlatformFee(BigDecimal platformFee) {
        this.platformFee = platformFee;
    }

    public BigDecimal getTotalFbaDeliveryFee() {
        return totalFbaDeliveryFee;
    }

    public void setTotalFbaDeliveryFee(BigDecimal totalFbaDeliveryFee) {
        this.totalFbaDeliveryFee = totalFbaDeliveryFee;
    }

    public BigDecimal getFbaDeliveryFee() {
        return fbaDeliveryFee;
    }

    public void setFbaDeliveryFee(BigDecimal fbaDeliveryFee) {
        this.fbaDeliveryFee = fbaDeliveryFee;
    }

    public BigDecimal getMcFbaDeliveryFee() {
        return mcFbaDeliveryFee;
    }

    public void setMcFbaDeliveryFee(BigDecimal mcFbaDeliveryFee) {
        this.mcFbaDeliveryFee = mcFbaDeliveryFee;
    }

    public BigDecimal getOtherTransactionFees() {
        return otherTransactionFees;
    }

    public void setOtherTransactionFees(BigDecimal otherTransactionFees) {
        this.otherTransactionFees = otherTransactionFees;
    }

    public BigDecimal getTotalAdsCost() {
        return totalAdsCost;
    }

    public void setTotalAdsCost(BigDecimal totalAdsCost) {
        this.totalAdsCost = totalAdsCost;
    }

    public BigDecimal getAdsSpCost() {
        return adsSpCost;
    }

    public void setAdsSpCost(BigDecimal adsSpCost) {
        this.adsSpCost = adsSpCost;
    }

    public BigDecimal getAdsSbCost() {
        return adsSbCost;
    }

    public void setAdsSbCost(BigDecimal adsSbCost) {
        this.adsSbCost = adsSbCost;
    }

    public BigDecimal getAdsSbvCost() {
        return adsSbvCost;
    }

    public void setAdsSbvCost(BigDecimal adsSbvCost) {
        this.adsSbvCost = adsSbvCost;
    }

    public BigDecimal getAdsSdCost() {
        return adsSdCost;
    }

    public void setAdsSdCost(BigDecimal adsSdCost) {
        this.adsSdCost = adsSdCost;
    }

    public BigDecimal getSharedCostOfAdvertising() {
        return sharedCostOfAdvertising;
    }

    public void setSharedCostOfAdvertising(BigDecimal sharedCostOfAdvertising) {
        this.sharedCostOfAdvertising = sharedCostOfAdvertising;
    }

    public BigDecimal getPromotionFee() {
        return promotionFee;
    }

    public void setPromotionFee(BigDecimal promotionFee) {
        this.promotionFee = promotionFee;
    }

    public BigDecimal getSharedSubscriptionFee() {
        return sharedSubscriptionFee;
    }

    public void setSharedSubscriptionFee(BigDecimal sharedSubscriptionFee) {
        this.sharedSubscriptionFee = sharedSubscriptionFee;
    }

    public BigDecimal getSharedLdFee() {
        return sharedLdFee;
    }

    public void setSharedLdFee(BigDecimal sharedLdFee) {
        this.sharedLdFee = sharedLdFee;
    }

    public BigDecimal getSharedCouponFee() {
        return sharedCouponFee;
    }

    public void setSharedCouponFee(BigDecimal sharedCouponFee) {
        this.sharedCouponFee = sharedCouponFee;
    }

    public BigDecimal getSharedEarlyReviewerProgramFee() {
        return sharedEarlyReviewerProgramFee;
    }

    public void setSharedEarlyReviewerProgramFee(BigDecimal sharedEarlyReviewerProgramFee) {
        this.sharedEarlyReviewerProgramFee = sharedEarlyReviewerProgramFee;
    }

    public BigDecimal getSharedVineFee() {
        return sharedVineFee;
    }

    public void setSharedVineFee(BigDecimal sharedVineFee) {
        this.sharedVineFee = sharedVineFee;
    }

    public BigDecimal getTotalStorageFee() {
        return totalStorageFee;
    }

    public void setTotalStorageFee(BigDecimal totalStorageFee) {
        this.totalStorageFee = totalStorageFee;
    }

    public BigDecimal getFbaStorageFee() {
        return fbaStorageFee;
    }

    public void setFbaStorageFee(BigDecimal fbaStorageFee) {
        this.fbaStorageFee = fbaStorageFee;
    }

    public BigDecimal getSharedFbaStorageFee() {
        return sharedFbaStorageFee;
    }

    public void setSharedFbaStorageFee(BigDecimal sharedFbaStorageFee) {
        this.sharedFbaStorageFee = sharedFbaStorageFee;
    }

    public BigDecimal getLongTermStorageFee() {
        return longTermStorageFee;
    }

    public void setLongTermStorageFee(BigDecimal longTermStorageFee) {
        this.longTermStorageFee = longTermStorageFee;
    }

    public BigDecimal getSharedLongTermStorageFee() {
        return sharedLongTermStorageFee;
    }

    public void setSharedLongTermStorageFee(BigDecimal sharedLongTermStorageFee) {
        this.sharedLongTermStorageFee = sharedLongTermStorageFee;
    }

    public BigDecimal getSharedStorageRenewalBilling() {
        return sharedStorageRenewalBilling;
    }

    public void setSharedStorageRenewalBilling(BigDecimal sharedStorageRenewalBilling) {
        this.sharedStorageRenewalBilling = sharedStorageRenewalBilling;
    }

    public BigDecimal getSharedFbaDisposalFee() {
        return sharedFbaDisposalFee;
    }

    public void setSharedFbaDisposalFee(BigDecimal sharedFbaDisposalFee) {
        this.sharedFbaDisposalFee = sharedFbaDisposalFee;
    }

    public BigDecimal getSharedFbaRemovalFee() {
        return sharedFbaRemovalFee;
    }

    public void setSharedFbaRemovalFee(BigDecimal sharedFbaRemovalFee) {
        this.sharedFbaRemovalFee = sharedFbaRemovalFee;
    }

    public BigDecimal getSharedFbaInboundTransportationProgramFee() {
        return sharedFbaInboundTransportationProgramFee;
    }

    public void setSharedFbaInboundTransportationProgramFee(BigDecimal sharedFbaInboundTransportationProgramFee) {
        this.sharedFbaInboundTransportationProgramFee = sharedFbaInboundTransportationProgramFee;
    }

    public BigDecimal getSharedLabelingFee() {
        return sharedLabelingFee;
    }

    public void setSharedLabelingFee(BigDecimal sharedLabelingFee) {
        this.sharedLabelingFee = sharedLabelingFee;
    }

    public BigDecimal getSharedPolybaggingFee() {
        return sharedPolybaggingFee;
    }

    public void setSharedPolybaggingFee(BigDecimal sharedPolybaggingFee) {
        this.sharedPolybaggingFee = sharedPolybaggingFee;
    }

    public BigDecimal getSharedBubblewrapFee() {
        return sharedBubblewrapFee;
    }

    public void setSharedBubblewrapFee(BigDecimal sharedBubblewrapFee) {
        this.sharedBubblewrapFee = sharedBubblewrapFee;
    }

    public BigDecimal getSharedTapingFee() {
        return sharedTapingFee;
    }

    public void setSharedTapingFee(BigDecimal sharedTapingFee) {
        this.sharedTapingFee = sharedTapingFee;
    }

    public BigDecimal getSharedFbaCustomerReturnFee() {
        return sharedFbaCustomerReturnFee;
    }

    public void setSharedFbaCustomerReturnFee(BigDecimal sharedFbaCustomerReturnFee) {
        this.sharedFbaCustomerReturnFee = sharedFbaCustomerReturnFee;
    }

    public BigDecimal getSharedFbaInboundDefectFee() {
        return sharedFbaInboundDefectFee;
    }

    public void setSharedFbaInboundDefectFee(BigDecimal sharedFbaInboundDefectFee) {
        this.sharedFbaInboundDefectFee = sharedFbaInboundDefectFee;
    }

    public BigDecimal getSharedFbaOverageFee() {
        return sharedFbaOverageFee;
    }

    public void setSharedFbaOverageFee(BigDecimal sharedFbaOverageFee) {
        this.sharedFbaOverageFee = sharedFbaOverageFee;
    }

    public BigDecimal getSharedAmazonPartneredCarrierShipmentFee() {
        return sharedAmazonPartneredCarrierShipmentFee;
    }

    public void setSharedAmazonPartneredCarrierShipmentFee(BigDecimal sharedAmazonPartneredCarrierShipmentFee) {
        this.sharedAmazonPartneredCarrierShipmentFee = sharedAmazonPartneredCarrierShipmentFee;
    }

    public BigDecimal getSharedFbaInboundConvenienceFee() {
        return sharedFbaInboundConvenienceFee;
    }

    public void setSharedFbaInboundConvenienceFee(BigDecimal sharedFbaInboundConvenienceFee) {
        this.sharedFbaInboundConvenienceFee = sharedFbaInboundConvenienceFee;
    }

    public BigDecimal getSharedItemFeeAdjustment() {
        return sharedItemFeeAdjustment;
    }

    public void setSharedItemFeeAdjustment(BigDecimal sharedItemFeeAdjustment) {
        this.sharedItemFeeAdjustment = sharedItemFeeAdjustment;
    }

    public BigDecimal getSharedOtherFbaInventoryFees() {
        return sharedOtherFbaInventoryFees;
    }

    public void setSharedOtherFbaInventoryFees(BigDecimal sharedOtherFbaInventoryFees) {
        this.sharedOtherFbaInventoryFees = sharedOtherFbaInventoryFees;
    }

    public BigDecimal getFbaStorageFeeAccrual() {
        return fbaStorageFeeAccrual;
    }

    public void setFbaStorageFeeAccrual(BigDecimal fbaStorageFeeAccrual) {
        this.fbaStorageFeeAccrual = fbaStorageFeeAccrual;
    }

    public BigDecimal getFbaStorageFeeAccrualDifference() {
        return fbaStorageFeeAccrualDifference;
    }

    public void setFbaStorageFeeAccrualDifference(BigDecimal fbaStorageFeeAccrualDifference) {
        this.fbaStorageFeeAccrualDifference = fbaStorageFeeAccrualDifference;
    }

    public BigDecimal getLongTermStorageFeeAccrual() {
        return longTermStorageFeeAccrual;
    }

    public void setLongTermStorageFeeAccrual(BigDecimal longTermStorageFeeAccrual) {
        this.longTermStorageFeeAccrual = longTermStorageFeeAccrual;
    }

    public BigDecimal getLongTermStorageFeeAccrualDifference() {
        return longTermStorageFeeAccrualDifference;
    }

    public void setLongTermStorageFeeAccrualDifference(BigDecimal longTermStorageFeeAccrualDifference) {
        this.longTermStorageFeeAccrualDifference = longTermStorageFeeAccrualDifference;
    }

    public BigDecimal getSharedFbaLongegerernationalInboundFee() {
        return sharedFbaLongegerernationalInboundFee;
    }

    public void setSharedFbaLongegerernationalInboundFee(BigDecimal sharedFbaLongegerernationalInboundFee) {
        this.sharedFbaLongegerernationalInboundFee = sharedFbaLongegerernationalInboundFee;
    }

    public BigDecimal getAdjustments() {
        return adjustments;
    }

    public void setAdjustments(BigDecimal adjustments) {
        this.adjustments = adjustments;
    }

    public BigDecimal getTotalPlatformOtherFee() {
        return totalPlatformOtherFee;
    }

    public void setTotalPlatformOtherFee(BigDecimal totalPlatformOtherFee) {
        this.totalPlatformOtherFee = totalPlatformOtherFee;
    }

    public BigDecimal getShippingLabelPurchases() {
        return shippingLabelPurchases;
    }

    public void setShippingLabelPurchases(BigDecimal shippingLabelPurchases) {
        this.shippingLabelPurchases = shippingLabelPurchases;
    }

    public BigDecimal getSharedCarrierShippingLabelAdjustments() {
        return sharedCarrierShippingLabelAdjustments;
    }

    public void setSharedCarrierShippingLabelAdjustments(BigDecimal sharedCarrierShippingLabelAdjustments) {
        this.sharedCarrierShippingLabelAdjustments = sharedCarrierShippingLabelAdjustments;
    }

    public BigDecimal getSharedLiquidationsFees() {
        return sharedLiquidationsFees;
    }

    public void setSharedLiquidationsFees(BigDecimal sharedLiquidationsFees) {
        this.sharedLiquidationsFees = sharedLiquidationsFees;
    }

    public BigDecimal getSharedManualProcessingFee() {
        return sharedManualProcessingFee;
    }

    public void setSharedManualProcessingFee(BigDecimal sharedManualProcessingFee) {
        this.sharedManualProcessingFee = sharedManualProcessingFee;
    }

    public BigDecimal getSharedOtherServiceFees() {
        return sharedOtherServiceFees;
    }

    public void setSharedOtherServiceFees(BigDecimal sharedOtherServiceFees) {
        this.sharedOtherServiceFees = sharedOtherServiceFees;
    }

    public BigDecimal getTotalSalesTax() {
        return totalSalesTax;
    }

    public void setTotalSalesTax(BigDecimal totalSalesTax) {
        this.totalSalesTax = totalSalesTax;
    }

    public BigDecimal getTaxCollected() {
        return taxCollected;
    }

    public void setTaxCollected(BigDecimal taxCollected) {
        this.taxCollected = taxCollected;
    }

    public BigDecimal getTcsIgstCollected() {
        return tcsIgstCollected;
    }

    public void setTcsIgstCollected(BigDecimal tcsIgstCollected) {
        this.tcsIgstCollected = tcsIgstCollected;
    }

    public BigDecimal getTcsSgstCollected() {
        return tcsSgstCollected;
    }

    public void setTcsSgstCollected(BigDecimal tcsSgstCollected) {
        this.tcsSgstCollected = tcsSgstCollected;
    }

    public BigDecimal getTcsCgstCollected() {
        return tcsCgstCollected;
    }

    public void setTcsCgstCollected(BigDecimal tcsCgstCollected) {
        this.tcsCgstCollected = tcsCgstCollected;
    }

    public BigDecimal getSharedComminglingVatExpenses() {
        return sharedComminglingVatExpenses;
    }

    public void setSharedComminglingVatExpenses(BigDecimal sharedComminglingVatExpenses) {
        this.sharedComminglingVatExpenses = sharedComminglingVatExpenses;
    }

    public BigDecimal getSalesTaxRefund() {
        return salesTaxRefund;
    }

    public void setSalesTaxRefund(BigDecimal salesTaxRefund) {
        this.salesTaxRefund = salesTaxRefund;
    }

    public BigDecimal getTaxRefunded() {
        return taxRefunded;
    }

    public void setTaxRefunded(BigDecimal taxRefunded) {
        this.taxRefunded = taxRefunded;
    }

    public BigDecimal getTcsIgstRefunded() {
        return tcsIgstRefunded;
    }

    public void setTcsIgstRefunded(BigDecimal tcsIgstRefunded) {
        this.tcsIgstRefunded = tcsIgstRefunded;
    }

    public BigDecimal getTcsSgstRefunded() {
        return tcsSgstRefunded;
    }

    public void setTcsSgstRefunded(BigDecimal tcsSgstRefunded) {
        this.tcsSgstRefunded = tcsSgstRefunded;
    }

    public BigDecimal getTcsCgstRefunded() {
        return tcsCgstRefunded;
    }

    public void setTcsCgstRefunded(BigDecimal tcsCgstRefunded) {
        this.tcsCgstRefunded = tcsCgstRefunded;
    }

    public BigDecimal getSalesTaxWithheld() {
        return salesTaxWithheld;
    }

    public void setSalesTaxWithheld(BigDecimal salesTaxWithheld) {
        this.salesTaxWithheld = salesTaxWithheld;
    }

    public BigDecimal getRefundTaxWithheld() {
        return refundTaxWithheld;
    }

    public void setRefundTaxWithheld(BigDecimal refundTaxWithheld) {
        this.refundTaxWithheld = refundTaxWithheld;
    }

    public BigDecimal getTdsSection194ONet() {
        return tdsSection194ONet;
    }

    public void setTdsSection194ONet(BigDecimal tdsSection194ONet) {
        this.tdsSection194ONet = tdsSection194ONet;
    }

    public BigDecimal getCgPriceTotal() {
        return cgPriceTotal;
    }

    public void setCgPriceTotal(BigDecimal cgPriceTotal) {
        this.cgPriceTotal = cgPriceTotal;
    }

    public Long getHasCgPriceDetail() {
        return hasCgPriceDetail;
    }

    public void setHasCgPriceDetail(Long hasCgPriceDetail) {
        this.hasCgPriceDetail = hasCgPriceDetail;
    }

    public BigDecimal getCgUnitPrice() {
        return cgUnitPrice;
    }

    public void setCgUnitPrice(BigDecimal cgUnitPrice) {
        this.cgUnitPrice = cgUnitPrice;
    }

    public BigDecimal getProportionOfCg() {
        return proportionOfCg;
    }

    public void setProportionOfCg(BigDecimal proportionOfCg) {
        this.proportionOfCg = proportionOfCg;
    }

    public BigDecimal getCgTransportCostsTotal() {
        return cgTransportCostsTotal;
    }

    public void setCgTransportCostsTotal(BigDecimal cgTransportCostsTotal) {
        this.cgTransportCostsTotal = cgTransportCostsTotal;
    }

    public Long getHasCgTransportCostsDetail() {
        return hasCgTransportCostsDetail;
    }

    public void setHasCgTransportCostsDetail(Long hasCgTransportCostsDetail) {
        this.hasCgTransportCostsDetail = hasCgTransportCostsDetail;
    }

    public BigDecimal getCgTransportUnitCosts() {
        return cgTransportUnitCosts;
    }

    public void setCgTransportUnitCosts(BigDecimal cgTransportUnitCosts) {
        this.cgTransportUnitCosts = cgTransportUnitCosts;
    }

    public BigDecimal getProportionOfCgTransport() {
        return proportionOfCgTransport;
    }

    public void setProportionOfCgTransport(BigDecimal proportionOfCgTransport) {
        this.proportionOfCgTransport = proportionOfCgTransport;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public BigDecimal getProportionOfTotalCost() {
        return proportionOfTotalCost;
    }

    public void setProportionOfTotalCost(BigDecimal proportionOfTotalCost) {
        this.proportionOfTotalCost = proportionOfTotalCost;
    }

    public BigDecimal getCgOtherCostsTotal() {
        return cgOtherCostsTotal;
    }

    public void setCgOtherCostsTotal(BigDecimal cgOtherCostsTotal) {
        this.cgOtherCostsTotal = cgOtherCostsTotal;
    }

    public BigDecimal getCgOtherUnitCosts() {
        return cgOtherUnitCosts;
    }

    public void setCgOtherUnitCosts(BigDecimal cgOtherUnitCosts) {
        this.cgOtherUnitCosts = cgOtherUnitCosts;
    }

    public Long getHasCgOtherCostsDetail() {
        return hasCgOtherCostsDetail;
    }

    public void setHasCgOtherCostsDetail(Long hasCgOtherCostsDetail) {
        this.hasCgOtherCostsDetail = hasCgOtherCostsDetail;
    }

    public BigDecimal getProportionOfCgOtherCosts() {
        return proportionOfCgOtherCosts;
    }

    public void setProportionOfCgOtherCosts(BigDecimal proportionOfCgOtherCosts) {
        this.proportionOfCgOtherCosts = proportionOfCgOtherCosts;
    }

    public BigDecimal getGrossProfit() {
        return grossProfit;
    }

    public void setGrossProfit(BigDecimal grossProfit) {
        this.grossProfit = grossProfit;
    }

    public BigDecimal getGrossRate() {
        return grossRate;
    }

    public void setGrossRate(BigDecimal grossRate) {
        this.grossRate = grossRate;
    }

    public BigDecimal getCustomOrderFee() {
        return customOrderFee;
    }

    public void setCustomOrderFee(BigDecimal customOrderFee) {
        this.customOrderFee = customOrderFee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getPostedDateLocale() {
        return postedDateLocale;
    }

    public void setPostedDateLocale(String postedDateLocale) {
        this.postedDateLocale = postedDateLocale;
    }

    public Boolean getIsDisplayDetail() {
        return isDisplayDetail;
    }

    public void setIsDisplayDetail(Boolean isDisplayDetail) {
        this.isDisplayDetail = isDisplayDetail;
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }

    public String getMsku() {
        return msku;
    }

    public void setMsku(String msku) {
        this.msku = msku;
    }

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public String getParentAsin() {
        return parentAsin;
    }

    public void setParentAsin(String parentAsin) {
        this.parentAsin = parentAsin;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getLocalSku() {
        return localSku;
    }

    public void setLocalSku(String localSku) {
        this.localSku = localSku;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Object getPrincipalRealname() {
        return principalRealname;
    }

    public void setPrincipalRealname(Object principalRealname) {
        this.principalRealname = principalRealname;
    }

    public Object getProductDeveloperRealname() {
        return productDeveloperRealname;
    }

    public void setProductDeveloperRealname(Object productDeveloperRealname) {
        this.productDeveloperRealname = productDeveloperRealname;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyIcon() {
        return currencyIcon;
    }

    public void setCurrencyIcon(String currencyIcon) {
        this.currencyIcon = currencyIcon;
    }

    public String getListingTagIds() {
        return listingTagIds;
    }

    public void setListingTagIds(String listingTagIds) {
        this.listingTagIds = listingTagIds;
    }

    public List<OtherFeeStrBean> getOtherFeeStr() {
        return otherFeeStr;
    }

    public void setOtherFeeStr(List<OtherFeeStrBean> otherFeeStr) {
        this.otherFeeStr = otherFeeStr;
    }

    public static class OtherFeeStrBean {

        private Long otherFeeTypeId;
        private String otherFeeName;
        private BigDecimal feeAllocation;

        public Long getOtherFeeTypeId() {
            return otherFeeTypeId;
        }

        public void setOtherFeeTypeId(Long otherFeeTypeId) {
            this.otherFeeTypeId = otherFeeTypeId;
        }

        public String getOtherFeeName() {
            return otherFeeName;
        }

        public void setOtherFeeName(String otherFeeName) {
            this.otherFeeName = otherFeeName;
        }

        public BigDecimal getFeeAllocation() {
            return feeAllocation;
        }

        public void setFeeAllocation(BigDecimal feeAllocation) {
            this.feeAllocation = feeAllocation;
        }
    }
}
    
