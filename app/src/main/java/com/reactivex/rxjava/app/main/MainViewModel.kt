package com.reactivex.rxjava.app.main

import com.reactivex.rxjava.app.base.BaseViewModel
import com.reactivex.rxjava.app.rx.SchedulersFacade
import javax.inject.Inject

class MainViewModel @Inject constructor(val schedulersFacade: SchedulersFacade):BaseViewModel(schedulersFacade) {

}