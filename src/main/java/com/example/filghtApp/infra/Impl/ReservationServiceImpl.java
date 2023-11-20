package com.example.filghtApp.infra.Impl;

import com.example.filghtApp.common.Helper.CommonUtil;
import com.example.filghtApp.common.exception.CommonException;
import com.example.filghtApp.common.exception.ErrorCode;
import com.example.filghtApp.domain.dto.FlightsDTO;
import com.example.filghtApp.domain.service.ReservationService;

import java.util.ArrayList;
import java.util.List;

import static com.example.filghtApp.domain.service.DataStore.flightsList;

public class ReservationServiceImpl implements ReservationService {


    @Override
    public List<FlightsDTO> getAllFlightList() {
        CommonUtil.sortFlightsByDepartureTime(flightsList);
        return new ArrayList<>(flightsList);
    }

    @Override
    public List<FlightsDTO> getFilterList(String departure, String destination) {
        try {
            List<FlightsDTO> filteredList = CommonUtil.filterFlights(flightsList, departure, destination);
            CommonUtil.sortFlightsByDepartureTime(filteredList);
            return filteredList;
        } catch (IndexOutOfBoundsException e) {
            throw new CommonException(ErrorCode.INVALID_INPUT);
        } catch (Exception e) {
            throw new CommonException(ErrorCode.DATABASE_ERROR);
        }
    }


}


