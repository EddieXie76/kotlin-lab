package com.derbysoft.kotlin

import com.derbysoft.common.util.CodeGenerator
import com.derbysoft.dswitch.dto.hotel.avail.HotelAvailCriteriaDTO
import com.derbysoft.dswitch.dto.hotel.avail.HotelAvailRQ
import com.derbysoft.dswitch.dto.hotel.avail.RoomStayCandidateDTO
import com.derbysoft.dswitch.dto.hotel.common.StayDateRangeDTO
import com.derbysoft.dswitch.remote.hotel.buyer.DefaultHotelBuyerRemoteService
import com.derbysoft.dswitch.remote.hotel.dto.HotelAvailRequest
import com.derbysoft.dswitch.remote.hotel.dto.RequestHeader
import com.derbysoft.unit.AbstractTestSupport
import org.junit.Test


class DSwitchGetAvailabilityTest : AbstractTestSupport() {

    val oregonDSwitch = DefaultHotelBuyerRemoteService("54.186.187.63:9002-9008")

    @Test
    fun getAvailability() {

//        val request:HotelAvailRequest = HotelAvailRequest(
//                RequestHeader("MMT", "ACCOR", CodeGenerator.generate()),
//                HotelAvailRQ(HotelAvailCriteriaDTO(
//                        StayDateRangeDTO("2020-05-01","2020-05-02"),
//                        RoomStayCandidateDTO( 1, 1, 0))))
        val request: HotelAvailRequest = fromXml("""
<com.derbysoft.dswitch.remote.hotel.dto.HotelAvailRequest>
  <body class="com.derbysoft.dswitch.dto.hotel.avail.HotelAvailRQ">
    <availCriteria>
      <hotelCodes>
        <string>6529</string>
      </hotelCodes>
      <stayDateRange>
        <checkin>2020-05-01</checkin>
        <checkout>2020-05-02</checkout>
      </stayDateRange>
      <roomStayCandidate>
        <numberOfUnits>1</numberOfUnits>
        <adultCount>1</adultCount>
        <childCount>0</childCount>
      </roomStayCandidate>
    </availCriteria>
  </body>
  <header>
    <taskId>TEST-${CodeGenerator.generate()}</taskId>
    <source>MMT</source>
    <destination>ACCOR</destination>
  </header>
</com.derbysoft.dswitch.remote.hotel.dto.HotelAvailRequest>
     """.trimIndent())
        println(toXml(request))
        val response = oregonDSwitch.getNoCachedAvailability(request)
        println(toXml(response))
        response?.hotelAvailRS?.hotelAvailRoomStaysList?.forEach{
            it?.roomStaysList?.forEach {
                println("RatePlan:${it?.ratePlan?.code} " +
                        "RoomType:${it?.roomType?.code} " +
                        "ABT:${it?.roomRate?.ratesList?.get(0)?.amountBeforeTax} " +
                        "AAT:${it?.roomRate?.ratesList?.get(0)?.amountBeforeTax}")
            }
        }
    }
}