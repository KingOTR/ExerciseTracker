package com.example.rungps;

import android.content.ClipData;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.widget.Toast;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.example.rungps.data.PointEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RunEntity;
import com.example.rungps.data.RunHrSampleEntity;
import com.example.rungps.export.GpxExporter;
import com.example.rungps.export.HrSample;
import com.example.rungps.export.TrackPoint;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: MainActivityExports.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.MainActivityExportsKt$exportAndShare$1", f = "MainActivityExports.kt", i = {0, 0, 1, 1, 1, 3, 3, 3}, l = {32, 33, 35, 41, 65, ExerciseSessionRecord.EXERCISE_TYPE_WEIGHTLIFTING, 93}, m = "invokeSuspend", n = {"$this$launch", "repo", "$this$launch", "repo", "run", "$this$launch", "run", "pts"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
final class MainActivityExportsKt$exportAndShare$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MainActivity $activity;
    final /* synthetic */ long $runId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainActivityExportsKt$exportAndShare$1(MainActivity mainActivity, long j, Continuation<? super MainActivityExportsKt$exportAndShare$1> continuation) {
        super(2, continuation);
        this.$activity = mainActivity;
        this.$runId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MainActivityExportsKt$exportAndShare$1 mainActivityExportsKt$exportAndShare$1 = new MainActivityExportsKt$exportAndShare$1(this.$activity, this.$runId, continuation);
        mainActivityExportsKt$exportAndShare$1.L$0 = obj;
        return mainActivityExportsKt$exportAndShare$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainActivityExportsKt$exportAndShare$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0103 A[LOOP:0: B:17:0x00fd->B:19:0x0103, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0136 A[LOOP:1: B:22:0x0130->B:24:0x0136, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Repository repository;
        Object runById;
        RunEntity runEntity;
        Object pointsForRun;
        CoroutineScope coroutineScope2;
        RunEntity runEntity2;
        List list;
        Object hrSamplesForRun;
        RunEntity runEntity3;
        List list2;
        String formatExportDate;
        ContentValues contentValues;
        Object m7905constructorimpl;
        Uri uri;
        Object m7905constructorimpl2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                repository = Repository.INSTANCE.get(this.$activity);
                this.L$0 = coroutineScope;
                this.L$1 = repository;
                this.label = 1;
                runById = repository.runById(this.$runId, this);
                if (runById == coroutine_suspended) {
                    return coroutine_suspended;
                }
                runEntity = (RunEntity) runById;
                if (runEntity != null) {
                    return Unit.INSTANCE;
                }
                this.L$0 = coroutineScope;
                this.L$1 = repository;
                this.L$2 = runEntity;
                this.label = 2;
                pointsForRun = repository.pointsForRun(this.$runId, this);
                if (pointsForRun == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope2 = coroutineScope;
                runEntity2 = runEntity;
                list = (List) pointsForRun;
                if (list.size() >= 2) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.$activity, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                this.L$0 = coroutineScope2;
                this.L$1 = runEntity2;
                this.L$2 = list;
                this.label = 4;
                hrSamplesForRun = repository.hrSamplesForRun(this.$runId, this);
                if (hrSamplesForRun == coroutine_suspended) {
                    return coroutine_suspended;
                }
                runEntity3 = runEntity2;
                list2 = list;
                Iterable<RunHrSampleEntity> iterable = (Iterable) hrSamplesForRun;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (RunHrSampleEntity runHrSampleEntity : iterable) {
                    arrayList.add(new HrSample(runHrSampleEntity.getTimeMs(), runHrSampleEntity.getBpm()));
                }
                ArrayList arrayList2 = arrayList;
                GpxExporter gpxExporter = GpxExporter.INSTANCE;
                List<PointEntity> list3 = list2;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                for (PointEntity pointEntity : list3) {
                    arrayList3.add(new TrackPoint(pointEntity.getLat(), pointEntity.getLon(), pointEntity.getTimeMs(), pointEntity.getEleM(), null, 16, null));
                }
                List<TrackPoint> mergeHrIntoPoints = gpxExporter.mergeHrIntoPoints(arrayList3, arrayList2);
                GpxExporter gpxExporter2 = GpxExporter.INSTANCE;
                formatExportDate = MainActivityExportsKt.formatExportDate(runEntity3.getStartedAtMs());
                String gpx = gpxExporter2.toGpx("Run " + formatExportDate, runEntity3.getStartedAtMs(), mergeHrIntoPoints, arrayList2);
                String str = "run-" + this.$runId + ".gpx";
                Uri EXTERNAL_CONTENT_URI = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
                contentValues = new ContentValues();
                contentValues.put("_display_name", str);
                contentValues.put("mime_type", "application/gpx+xml");
                contentValues.put("relative_path", "Download/ExerciseTracker");
                contentValues.put("is_pending", Boxing.boxInt(1));
                MainActivity mainActivity = this.$activity;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(mainActivity.getContentResolver().insert(EXTERNAL_CONTENT_URI, contentValues));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                    m7905constructorimpl = null;
                }
                uri = (Uri) m7905constructorimpl;
                if (uri != null) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(this.$activity, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                MainActivity mainActivity2 = this.$activity;
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    OutputStream openOutputStream = mainActivity2.getContentResolver().openOutputStream(uri);
                    if (openOutputStream != null) {
                        OutputStreamWriter outputStreamWriter = openOutputStream;
                        try {
                            outputStreamWriter = new OutputStreamWriter(outputStreamWriter, Charsets.UTF_8);
                            try {
                                outputStreamWriter.write(gpx);
                                Unit unit = Unit.INSTANCE;
                                CloseableKt.closeFinally(outputStreamWriter, null);
                                Unit unit2 = Unit.INSTANCE;
                                CloseableKt.closeFinally(outputStreamWriter, null);
                            } finally {
                            }
                        } finally {
                        }
                    }
                    contentValues.clear();
                    contentValues.put("is_pending", Boxing.boxInt(0));
                    mainActivity2.getContentResolver().update(uri, contentValues, null, null);
                    m7905constructorimpl2 = Result.m7905constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    m7905constructorimpl2 = Result.m7905constructorimpl(ResultKt.createFailure(th2));
                }
                MainActivity mainActivity3 = this.$activity;
                if (Result.m7908exceptionOrNullimpl(m7905constructorimpl2) != null) {
                    try {
                        Result.Companion companion5 = Result.INSTANCE;
                        Result.m7905constructorimpl(Boxing.boxInt(mainActivity3.getContentResolver().delete(uri, null, null)));
                    } catch (Throwable th3) {
                        Result.Companion companion6 = Result.INSTANCE;
                        Result.m7905constructorimpl(ResultKt.createFailure(th3));
                    }
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    MainActivityExportsKt$exportAndShare$1$4$2 mainActivityExportsKt$exportAndShare$1$4$2 = new MainActivityExportsKt$exportAndShare$1$4$2(mainActivity3, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 6;
                    if (BuildersKt.withContext(main, mainActivityExportsKt$exportAndShare$1$4$2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                MainActivity mainActivity4 = this.$activity;
                intent.setType("application/gpx+xml");
                intent.putExtra("android.intent.extra.STREAM", uri);
                intent.setClipData(ClipData.newUri(mainActivity4.getContentResolver(), str, uri));
                intent.addFlags(1);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 7;
                if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass5(this.$activity, str, intent, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 1:
                Repository repository2 = (Repository) this.L$1;
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                runById = obj;
                repository = repository2;
                coroutineScope = coroutineScope3;
                runEntity = (RunEntity) runById;
                if (runEntity != null) {
                }
                break;
            case 2:
                runEntity2 = (RunEntity) this.L$2;
                repository = (Repository) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                pointsForRun = obj;
                list = (List) pointsForRun;
                if (list.size() >= 2) {
                }
                break;
            case 3:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 4:
                list2 = (List) this.L$2;
                RunEntity runEntity4 = (RunEntity) this.L$1;
                ResultKt.throwOnFailure(obj);
                runEntity3 = runEntity4;
                hrSamplesForRun = obj;
                Iterable<RunHrSampleEntity> iterable2 = (Iterable) hrSamplesForRun;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
                while (r3.hasNext()) {
                }
                ArrayList arrayList22 = arrayList4;
                GpxExporter gpxExporter3 = GpxExporter.INSTANCE;
                List<PointEntity> list32 = list2;
                ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list32, 10));
                while (r0.hasNext()) {
                }
                List<TrackPoint> mergeHrIntoPoints2 = gpxExporter3.mergeHrIntoPoints(arrayList32, arrayList22);
                GpxExporter gpxExporter22 = GpxExporter.INSTANCE;
                formatExportDate = MainActivityExportsKt.formatExportDate(runEntity3.getStartedAtMs());
                String gpx2 = gpxExporter22.toGpx("Run " + formatExportDate, runEntity3.getStartedAtMs(), mergeHrIntoPoints2, arrayList22);
                String str2 = "run-" + this.$runId + ".gpx";
                Uri EXTERNAL_CONTENT_URI2 = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
                Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI2, "EXTERNAL_CONTENT_URI");
                contentValues = new ContentValues();
                contentValues.put("_display_name", str2);
                contentValues.put("mime_type", "application/gpx+xml");
                contentValues.put("relative_path", "Download/ExerciseTracker");
                contentValues.put("is_pending", Boxing.boxInt(1));
                MainActivity mainActivity5 = this.$activity;
                Result.Companion companion7 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(mainActivity5.getContentResolver().insert(EXTERNAL_CONTENT_URI2, contentValues));
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                }
                uri = (Uri) m7905constructorimpl;
                if (uri != null) {
                }
                break;
            case 5:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 7:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: MainActivityExports.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.MainActivityExportsKt$exportAndShare$1$1", f = "MainActivityExports.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.MainActivityExportsKt$exportAndShare$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MainActivity $activity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MainActivity mainActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activity = mainActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$activity, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Toast.makeText(this.$activity, "Not enough GPS points to export.", 0).show();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: MainActivityExports.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.MainActivityExportsKt$exportAndShare$1$2", f = "MainActivityExports.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.MainActivityExportsKt$exportAndShare$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MainActivity $activity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(MainActivity mainActivity, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$activity = mainActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$activity, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Toast.makeText(this.$activity, "Couldn't save GPX to Downloads.", 1).show();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: MainActivityExports.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.MainActivityExportsKt$exportAndShare$1$5", f = "MainActivityExports.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.MainActivityExportsKt$exportAndShare$1$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MainActivity $activity;
        final /* synthetic */ String $name;
        final /* synthetic */ Intent $share;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(MainActivity mainActivity, String str, Intent intent, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$activity = mainActivity;
            this.$name = str;
            this.$share = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.$activity, this.$name, this.$share, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Toast.makeText(this.$activity, "Saved to Downloads/ExerciseTracker/" + this.$name, 1).show();
                this.$activity.startActivity(Intent.createChooser(this.$share, "Share to Strava"));
            } catch (Exception unused) {
                Toast.makeText(this.$activity, "Couldn't open share sheet.", 1).show();
            }
            return Unit.INSTANCE;
        }
    }
}
