package com.example.rungps.data;

import android.net.Uri;
import com.example.rungps.data.GymDao;
import com.example.rungps.importing.GymTrackingXlsxImporter;
import com.example.rungps.recovery.RecoveryModel;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RepositoryCloudSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/data/GymXlsxImportResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.RepositoryCloudSyncKt$importGymTrackingXlsxImpl$2", f = "RepositoryCloudSync.kt", i = {0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4}, l = {169, 171, 193, 201, 241}, m = "invokeSuspend", n = {"parsed", "splitName", "parsed", "splitName", "existing", "parsed", "splitName", "parsed", "splitName", "dayTemplates", "sess", "imported", "parsed", "splitName", "dayTemplates", "imported"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$2", "L$4", "I$0", "L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes3.dex */
final class RepositoryCloudSyncKt$importGymTrackingXlsxImpl$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GymXlsxImportResult>, Object> {
    final /* synthetic */ Repository $this_importGymTrackingXlsxImpl;
    final /* synthetic */ Uri $uri;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RepositoryCloudSyncKt$importGymTrackingXlsxImpl$2(Repository repository, Uri uri, Continuation<? super RepositoryCloudSyncKt$importGymTrackingXlsxImpl$2> continuation) {
        super(2, continuation);
        this.$this_importGymTrackingXlsxImpl = repository;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RepositoryCloudSyncKt$importGymTrackingXlsxImpl$2 repositoryCloudSyncKt$importGymTrackingXlsxImpl$2 = new RepositoryCloudSyncKt$importGymTrackingXlsxImpl$2(this.$this_importGymTrackingXlsxImpl, this.$uri, continuation);
        repositoryCloudSyncKt$importGymTrackingXlsxImpl$2.L$0 = obj;
        return repositoryCloudSyncKt$importGymTrackingXlsxImpl$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GymXlsxImportResult> continuation) {
        return ((RepositoryCloudSyncKt$importGymTrackingXlsxImpl$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0204 A[LOOP:3: B:59:0x01fe->B:61:0x0204, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e0  */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x037f -> B:9:0x0381). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0386 -> B:10:0x021f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        String str;
        Object splitByName;
        GymTrackingXlsxImporter.ParsedImport parsedImport;
        InputStream openInputStream;
        GymSplitEntity gymSplitEntity;
        Object createSplitWithPerDayExercises;
        long id;
        Object dayTemplatesForSplit;
        GymTrackingXlsxImporter.ParsedImport parsedImport2;
        LinkedHashMap linkedHashMap;
        Iterator<GymTrackingXlsxImporter.SessionInsert> it;
        Object obj2;
        GymTrackingXlsxImporter.ParsedImport parsedImport3;
        GymTrackingXlsxImporter.SessionInsert sessionInsert;
        long longValue;
        int i;
        LinkedHashMap linkedHashMap2;
        Double boxDouble;
        RecoveryModel.RecoveryEstimate estimateGym;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        int i3 = 4;
        int i4 = 1;
        int i5 = 0;
        Double d = null;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            File file = new File(this.$this_importGymTrackingXlsxImpl.getAppContext().getCacheDir(), "gym-tracking-import-tmp.xlsx");
            Repository repository = this.$this_importGymTrackingXlsxImpl;
            Uri uri = this.$uri;
            try {
                Result.Companion companion = Result.INSTANCE;
                openInputStream = repository.getAppContext().getContentResolver().openInputStream(uri);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            if (openInputStream != null) {
                FileOutputStream fileOutputStream = openInputStream;
                try {
                    InputStream inputStream = fileOutputStream;
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        long copyTo$default = ByteStreamsKt.copyTo$default(inputStream, fileOutputStream, 0, 2, null);
                        CloseableKt.closeFinally(fileOutputStream, null);
                        CloseableKt.closeFinally(fileOutputStream, null);
                        m7905constructorimpl = Result.m7905constructorimpl(Boxing.boxLong(copyTo$default));
                        Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
                        if (m7908exceptionOrNullimpl != null) {
                            String message = m7908exceptionOrNullimpl.getMessage();
                            if (message == null) {
                                message = "Copy failed";
                            }
                            return new GymXlsxImportResult(0, message, CollectionsKt.emptyList());
                        }
                        GymTrackingXlsxImporter.ParsedImport parse = GymTrackingXlsxImporter.INSTANCE.parse(file);
                        try {
                            Result.Companion companion3 = Result.INSTANCE;
                            Result.m7905constructorimpl(Boxing.boxBoolean(file.delete()));
                        } catch (Throwable th2) {
                            Result.Companion companion4 = Result.INSTANCE;
                            Result.m7905constructorimpl(ResultKt.createFailure(th2));
                        }
                        if (parse.getDaySpecs().isEmpty()) {
                            String str2 = (String) CollectionsKt.firstOrNull((List) parse.getWarnings());
                            if (str2 == null) {
                                str2 = "Nothing to import";
                            }
                            return new GymXlsxImportResult(0, str2, parse.getWarnings());
                        }
                        this.L$0 = parse;
                        str = "Gym Tracking import";
                        this.L$1 = "Gym Tracking import";
                        this.label = 1;
                        splitByName = this.$this_importGymTrackingXlsxImpl.getGymDao().splitByName("Gym Tracking import", this);
                        if (splitByName == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        parsedImport = parse;
                    } finally {
                    }
                } finally {
                }
            } else {
                return new GymXlsxImportResult(0, "Could not open file", CollectionsKt.emptyList());
            }
        } else if (i2 == 1) {
            String str3 = (String) this.L$1;
            parsedImport = (GymTrackingXlsxImporter.ParsedImport) this.L$0;
            ResultKt.throwOnFailure(obj);
            str = str3;
            splitByName = obj;
        } else {
            if (i2 == 2) {
                gymSplitEntity = (GymSplitEntity) this.L$2;
                String str4 = (String) this.L$1;
                parsedImport = (GymTrackingXlsxImporter.ParsedImport) this.L$0;
                ResultKt.throwOnFailure(obj);
                str = str4;
                createSplitWithPerDayExercises = obj;
                id = ((Number) createSplitWithPerDayExercises).longValue();
                if (gymSplitEntity == null) {
                    this.$this_importGymTrackingXlsxImpl.getAppContext().getSharedPreferences("settings", 0).edit().putLong("gymActiveSplitId", id).apply();
                }
                this.L$0 = parsedImport;
                this.L$1 = str;
                this.L$2 = null;
                this.label = 3;
                dayTemplatesForSplit = this.$this_importGymTrackingXlsxImpl.getGymDao().dayTemplatesForSplit(id, this);
                if (dayTemplatesForSplit == coroutine_suspended) {
                    return coroutine_suspended;
                }
                parsedImport2 = parsedImport;
                Iterable iterable = (Iterable) dayTemplatesForSplit;
                linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
                while (r0.hasNext()) {
                }
                it = parsedImport2.getSessions().iterator();
                while (it.hasNext()) {
                }
                return new GymXlsxImportResult(i5, "Imported " + i5 + " sessions into “" + str + "”. Heaviest sets feed PRs automatically.", parsedImport2.getWarnings());
            }
            if (i2 == 3) {
                String str5 = (String) this.L$1;
                parsedImport2 = (GymTrackingXlsxImporter.ParsedImport) this.L$0;
                ResultKt.throwOnFailure(obj);
                str = str5;
                dayTemplatesForSplit = obj;
                Iterable iterable2 = (Iterable) dayTemplatesForSplit;
                linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable2, 10)), 16));
                for (Object obj3 : iterable2) {
                    linkedHashMap.put(Boxing.boxInt(((GymDayTemplateEntity) obj3).getOrderIdx()), obj3);
                }
                it = parsedImport2.getSessions().iterator();
                while (it.hasNext()) {
                }
                return new GymXlsxImportResult(i5, "Imported " + i5 + " sessions into “" + str + "”. Heaviest sets feed PRs automatically.", parsedImport2.getWarnings());
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = this.I$0;
                Iterator<GymTrackingXlsxImporter.SessionInsert> it2 = (Iterator) this.L$3;
                ?? r6 = (Map) this.L$2;
                String str6 = (String) this.L$1;
                GymTrackingXlsxImporter.ParsedImport parsedImport4 = (GymTrackingXlsxImporter.ParsedImport) this.L$0;
                ResultKt.throwOnFailure(obj);
                char c = 5;
                str = str6;
                i5 = i6;
                it = it2;
                parsedImport2 = parsedImport4;
                linkedHashMap = r6;
                i3 = 4;
                i4 = 1;
                while (it.hasNext()) {
                    GymTrackingXlsxImporter.SessionInsert next = it.next();
                    GymDayTemplateEntity gymDayTemplateEntity = (GymDayTemplateEntity) linkedHashMap.get(Boxing.boxInt(next.getTemplateOrderIdx()));
                    if (gymDayTemplateEntity != null) {
                        this.L$0 = parsedImport2;
                        this.L$1 = str;
                        this.L$2 = linkedHashMap;
                        this.L$3 = it;
                        this.L$4 = next;
                        this.I$0 = i5;
                        this.label = i3;
                        obj2 = GymDao.DefaultImpls.insertRemoteFinishedSession$default(this.$this_importGymTrackingXlsxImpl.getGymDao(), next.getRemoteId(), next.getStartedAtMs(), next.getEndedAtMs(), Boxing.boxLong(gymDayTemplateEntity.getId()), false, "xlsx import", next.getSets(), null, null, this, 384, null);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        parsedImport3 = parsedImport2;
                        sessionInsert = next;
                        longValue = ((Number) obj2).longValue();
                        if (longValue <= 0) {
                            int i7 = i5 + 1;
                            double d2 = 0.0d;
                            for (RemoteGymSetRow remoteGymSetRow : sessionInsert.getSets()) {
                                d2 += remoteGymSetRow.getWeightKg() * (remoteGymSetRow.getReps() != null ? r19.intValue() : i4);
                            }
                            Iterator it3 = sessionInsert.getSets().iterator();
                            if (it3.hasNext()) {
                                i = i7;
                                double weightKg = ((RemoteGymSetRow) it3.next()).getWeightKg();
                                while (it3.hasNext()) {
                                    weightKg = Math.max(weightKg, ((RemoteGymSetRow) it3.next()).getWeightKg());
                                    linkedHashMap = linkedHashMap;
                                }
                                linkedHashMap2 = linkedHashMap;
                                boxDouble = Boxing.boxDouble(weightKg);
                            } else {
                                i = i7;
                                boxDouble = d;
                                linkedHashMap2 = linkedHashMap;
                            }
                            estimateGym = RecoveryModel.INSTANCE.estimateGym(d2, boxDouble != null ? boxDouble.doubleValue() : 0.0d, RangesKt.coerceAtLeast(sessionInsert.getEndedAtMs() - sessionInsert.getStartedAtMs(), 0L), (r24 & 8) != 0 ? null : this.$this_importGymTrackingXlsxImpl.demographicsForRecovery$app_sideload(), (r24 & 16) != 0 ? 0.0d : 0.0d, (r24 & 32) != 0 ? null : null);
                            this.L$0 = parsedImport3;
                            this.L$1 = str;
                            linkedHashMap = linkedHashMap2;
                            this.L$2 = linkedHashMap;
                            this.L$3 = it;
                            d = null;
                            this.L$4 = null;
                            int i8 = i;
                            this.I$0 = i8;
                            c = 5;
                            this.label = 5;
                            if (this.$this_importGymTrackingXlsxImpl.recordRecoveryEvent(new RecoveryEventEntity(0L, "GYM", longValue, sessionInsert.getEndedAtMs(), sessionInsert.getEndedAtMs() + ((long) (estimateGym.getHours() * 3600000.0d)), estimateGym.getLoadScore(), estimateGym.getNotes(), 1, null), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            i5 = i8;
                            parsedImport2 = parsedImport3;
                            i3 = 4;
                            i4 = 1;
                            while (it.hasNext()) {
                            }
                        } else {
                            parsedImport2 = parsedImport3;
                            while (it.hasNext()) {
                            }
                        }
                    }
                }
                return new GymXlsxImportResult(i5, "Imported " + i5 + " sessions into “" + str + "”. Heaviest sets feed PRs automatically.", parsedImport2.getWarnings());
            }
            int i9 = this.I$0;
            sessionInsert = (GymTrackingXlsxImporter.SessionInsert) this.L$4;
            Iterator<GymTrackingXlsxImporter.SessionInsert> it4 = (Iterator) this.L$3;
            ?? r8 = (Map) this.L$2;
            String str7 = (String) this.L$1;
            GymTrackingXlsxImporter.ParsedImport parsedImport5 = (GymTrackingXlsxImporter.ParsedImport) this.L$0;
            ResultKt.throwOnFailure(obj);
            str = str7;
            linkedHashMap = r8;
            i5 = i9;
            it = it4;
            parsedImport3 = parsedImport5;
            obj2 = obj;
            longValue = ((Number) obj2).longValue();
            if (longValue <= 0) {
            }
        }
        gymSplitEntity = (GymSplitEntity) splitByName;
        if (gymSplitEntity != null) {
            id = gymSplitEntity.getId();
            if (gymSplitEntity == null) {
            }
            this.L$0 = parsedImport;
            this.L$1 = str;
            this.L$2 = null;
            this.label = 3;
            dayTemplatesForSplit = this.$this_importGymTrackingXlsxImpl.getGymDao().dayTemplatesForSplit(id, this);
            if (dayTemplatesForSplit == coroutine_suspended) {
            }
        } else {
            this.L$0 = parsedImport;
            this.L$1 = str;
            this.L$2 = gymSplitEntity;
            this.label = 2;
            createSplitWithPerDayExercises = this.$this_importGymTrackingXlsxImpl.getGymDao().createSplitWithPerDayExercises(str, parsedImport.getDaySpecs(), 3, this);
            if (createSplitWithPerDayExercises == coroutine_suspended) {
                return coroutine_suspended;
            }
            id = ((Number) createSplitWithPerDayExercises).longValue();
            if (gymSplitEntity == null) {
            }
            this.L$0 = parsedImport;
            this.L$1 = str;
            this.L$2 = null;
            this.label = 3;
            dayTemplatesForSplit = this.$this_importGymTrackingXlsxImpl.getGymDao().dayTemplatesForSplit(id, this);
            if (dayTemplatesForSplit == coroutine_suspended) {
            }
        }
    }
}
