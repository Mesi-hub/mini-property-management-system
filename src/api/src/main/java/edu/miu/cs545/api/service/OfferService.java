package edu.miu.cs545.api.service;

import edu.miu.cs545.api.dto.OfferDto;
import edu.miu.cs545.api.entity.Offer;

import java.util.List;

public interface OfferService {
    List<OfferDto> checkOfferHistory(Long customerId);
    //boolean makeOffer(OfferDto offerDto);
    boolean makeOffer(Long id, OfferDto offerDto);

    OfferDto findById(Long id);
    List<OfferDto> findCurrentOffersByCustomerId(Long customerId);

}
