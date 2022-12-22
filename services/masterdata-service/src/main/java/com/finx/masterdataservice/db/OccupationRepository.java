package com.finx.masterdataservice.db;

import com.finx.masterdataservice.core.masterdata.domain.MasterData;
import java.util.List;

public interface OccupationRepository {

    List<MasterData> getOccupations();
}
