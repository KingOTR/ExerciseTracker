package com.example.rungps.export;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DataExporter.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.export.DataExporter", f = "DataExporter.kt", i = {}, l = {11}, m = "buildExportJson", n = {}, s = {})
/* loaded from: classes3.dex */
final class DataExporter$buildExportJson$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataExporter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataExporter$buildExportJson$1(DataExporter dataExporter, Continuation<? super DataExporter$buildExportJson$1> continuation) {
        super(continuation);
        this.this$0 = dataExporter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.buildExportJson(null, this);
    }
}
