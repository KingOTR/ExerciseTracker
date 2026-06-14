package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Trainregional.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TrainRegional", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getTrainRegional", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_trainRegional", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrainregionalKt {
    private static ImageVector _trainRegional;

    public static final ImageVector getTrainRegional(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _trainRegional;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TrainRegional", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(168.0f, 88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.lineTo(96.0f, 96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(223.72f, 122.1f);
        pathBuilder.lineTo(201.33f, 204.21f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 185.89f, 216.0f);
        pathBuilder.lineTo(176.0f, 216.0f);
        pathBuilder.lineToRelative(14.4f, 19.2f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.8f, 9.6f);
        pathBuilder.lineTo(156.0f, 216.0f);
        pathBuilder.lineTo(100.0f, 216.0f);
        pathBuilder.lineTo(78.4f, 244.8f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.8f, -9.6f);
        pathBuilder.lineTo(80.0f, 216.0f);
        pathBuilder.lineTo(70.11f, 216.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -15.44f, -11.79f);
        pathBuilder.lineTo(32.28f, 122.1f);
        pathBuilder.arcToRelative(8.08f, 8.08f, 0.0f, false, true, 0.0f, -4.2f);
        pathBuilder.lineTo(54.67f, 35.79f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 70.11f, 24.0f);
        pathBuilder.lineTo(185.89f, 24.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 15.44f, 11.79f);
        pathBuilder.lineToRelative(22.39f, 82.11f);
        pathBuilder.arcTo(8.08f, 8.08f, 0.0f, false, true, 223.72f, 122.1f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(206.0f, 113.69f);
        pathBuilder.lineTo(185.89f, 40.0f);
        pathBuilder.lineTo(70.11f, 40.0f);
        pathBuilder.lineTo(50.0f, 113.69f);
        pathBuilder.lineToRelative(78.0f, 14.18f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _trainRegional = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
