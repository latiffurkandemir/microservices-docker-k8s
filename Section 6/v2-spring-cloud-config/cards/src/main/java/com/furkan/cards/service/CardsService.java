package com.furkan.cards.service;

import com.furkan.cards.dto.CardsDTO;

public interface CardsService {
    void createCard(String mobileNumber);

    CardsDTO fetchCard(String mobileNumber);

    boolean updateCard(CardsDTO cardsDto);

    boolean deleteCard(String mobileNumber);

}
