package com.vj.medicinetime.alarm;

import com.vj.medicinetime.BasePresenter;
import com.vj.medicinetime.BaseView;
import com.vj.medicinetime.data.source.History;
import com.vj.medicinetime.data.source.MedicineAlarm;

/**
 * Created by gautam on 13/07/17.
 */

public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
