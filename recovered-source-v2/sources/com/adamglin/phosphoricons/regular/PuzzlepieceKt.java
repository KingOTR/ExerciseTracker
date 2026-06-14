package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Puzzlepiece.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PuzzlePiece", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPuzzlePiece", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_puzzlePiece", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PuzzlepieceKt {
    private static ImageVector _puzzlePiece;

    public static final ImageVector getPuzzlePiece(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _puzzlePiece;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PuzzlePiece", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(220.27f, 158.54f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.7f, -0.46f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 0.0f, -36.16f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 114.69f);
        pathBuilder.verticalLineTo(72.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f);
        pathBuilder.horizontalLineTo(171.78f);
        pathBuilder.arcToRelative(35.36f, 35.36f, 0.0f, false, false, 0.22f, -4.0f);
        pathBuilder.arcToRelative(36.11f, 36.11f, 0.0f, false, false, -11.36f, -26.24f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -60.55f, 23.62f);
        pathBuilder.arcToRelative(36.56f, 36.56f, 0.0f, false, false, 0.14f, 6.62f);
        pathBuilder.horizontalLineTo(64.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 72.0f);
        pathBuilder.verticalLineToRelative(32.22f);
        pathBuilder.arcToRelative(35.36f, 35.36f, 0.0f, false, false, -4.0f, -0.22f);
        pathBuilder.arcToRelative(36.12f, 36.12f, 0.0f, false, false, -26.24f, 11.36f);
        pathBuilder.arcToRelative(35.7f, 35.7f, 0.0f, false, false, -9.69f, 27.0f);
        pathBuilder.arcToRelative(36.08f, 36.08f, 0.0f, false, false, 33.31f, 33.6f);
        pathBuilder.arcToRelative(35.68f, 35.68f, 0.0f, false, false, 6.62f, -0.14f);
        pathBuilder.verticalLineTo(208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.verticalLineTo(165.31f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 220.27f, 158.54f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 208.0f);
        pathBuilder.horizontalLineTo(64.0f);
        pathBuilder.verticalLineTo(165.31f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.43f, -7.23f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 0.0f, -36.16f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 64.0f, 114.69f);
        pathBuilder.verticalLineTo(72.0f);
        pathBuilder.horizontalLineToRelative(46.69f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.23f, -11.43f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 36.16f, 0.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 161.31f, 72.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.verticalLineToRelative(32.23f);
        pathBuilder.arcToRelative(35.68f, 35.68f, 0.0f, false, false, -6.62f, -0.14f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 204.0f, 176.0f);
        pathBuilder.arcToRelative(35.36f, 35.36f, 0.0f, false, false, 4.0f, -0.22f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _puzzlePiece = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
